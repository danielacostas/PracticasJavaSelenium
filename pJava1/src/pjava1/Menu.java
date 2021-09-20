package pjava1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    private static final double PRIMER_TRAMO = 0.15;
    private static final double SEGUNDO_TRAMO = 0.2;
    private static final double TERCER_TRAMO = 0.35;
    private static final double CUARTO_TRAMO = 0.8;

    private static final int MAX = 100;

    public static void main (String[] args){

        Scanner lector = new Scanner(System.in);

        int opcion = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("1 - Calcula el consumo de agua");
            System.out.println("2 - Calcula las temperaturas");
            System.out.println("3 - Adivina el número oculto");
            System.out.println("4 - Finaliza el programa");

            try {
                System.out.println("Selecciona una opción:");

                opcion = lector.nextInt();

                switch (opcion) {
                    case 1: //Get water consumption
                        System.out.println("Introduce el número de metros cúbicos consumidos:");
                        int mCubicos = lector.nextInt();
                        if (mCubicos>0){
                            calculoConsumo(mCubicos);
                        }
                        else{
                            System.out.println("El número tiene que ser mayor que 0");
                        }
                        break;
                    case 2: //Get temperatures
                        System.out.println("Introduce el número de temperaturas:");
                        int nTemps = lector.nextInt();
                        if (nTemps>0){
                            calculoTemperatura(nTemps);
                        }
                        else{
                            System.out.println("El número tiene que ser mayor que 0");
                        }
                        break;
                    case 3: //Play guess how much
                        System.out.println("Adivina un número entre el 1 y el 100:");
                        int n = lector.nextInt();
                        if (n>0){
                            adivina(n);
                        }
                        else{
                            System.out.println("El número debe estar entre 1 y 100");
                        }
                        break;
                    case 4: //End Program
                        salir = true;
                        break;
                    default:
                        System.out.println("Escribe un número entre 1, 2 y 3:");
                }
            } catch (InputMismatchException e) {
                System.out.println("El número debe ser entre 1, 2 y 3");
                lector.next();
            }
        }
        System.out.println("Fin del programa");
    }

    private static void adivina(int n) {

        boolean correcto = false;
        int nInicio = n;
        int intentos = 1;
        Scanner lector = new Scanner(System.in);

        //Create a random int between 1 and 100
        Random r = new Random();
        int numAzar = r.nextInt(MAX);

        while(!correcto){
            if (nInicio == numAzar) {
                correcto = true;
                System.out.println("¡Correcto! El número misterioso es " + nInicio);
                if (intentos == 1){
                    System.out.println("¡BINGO! ¡Deberías echar la lotería!");
                }
                else {
                    System.out.println("Has necesitado " + intentos + " intentos.");
                }
            }
            else if (nInicio < numAzar){
                System.out.println("El número misterioso es MAYOR que " + nInicio);
                nInicio = lector.nextInt();
            }
            else {
                System.out.println("El número misterioso es MENOR que " + nInicio);
                nInicio = lector.nextInt();
            }
            intentos++;
        }
    }

    private static void calculoTemperatura(int nTemps) {

        Scanner lector = new Scanner(System.in);

        //Create an array with the temperatures
        int[] temperaturas = new int[nTemps];
        for (int t =0; t < nTemps; t++) {
             temperaturas[t] = lector.nextInt();
        }

        //Get the number of temperatures higher than 0 and the average
        int ceroGrados = 0;
        int total = 0;

        for (int t : temperaturas) {
            if (t<0){
                ceroGrados++;
            }
            total+=t;
        }

        double media = (double) total/nTemps;

        System.out.println("Días con la temperatura bajo cero: " + ceroGrados);
        System.out.println("Temperatura media: " + media);
    }

    public static void calculoConsumo(int mCubicos) {
        double precioFinal = 0;
        double precioEuros = 0; //Number rounded to 2 decimal
        double precioPrimerTramo = 100 * PRIMER_TRAMO;
        double precioSegundoTramo = 500 * SEGUNDO_TRAMO;
        double precioTercerTramo = 500 * TERCER_TRAMO;

        if (mCubicos <= 100){
            precioFinal += (mCubicos * PRIMER_TRAMO);
            precioEuros = Math.round(precioFinal*100.0)/100.0;
            System.out.println("El precio final correspondiente al Primer Tramo es de: " + precioEuros + " euros");
        }
        else if (mCubicos <= 600){
            precioFinal += (precioPrimerTramo + (mCubicos-100) * SEGUNDO_TRAMO);
            precioEuros = Math.round(precioFinal*100.0)/100.0;
            System.out.println("El precio final correspondiente al Segundo Tramo es de: " + precioEuros + " euros");
        }
        else if (mCubicos <= 1100){
            precioFinal += (precioPrimerTramo + precioSegundoTramo + (mCubicos-600) * TERCER_TRAMO);
            precioEuros = Math.round(precioFinal*100.0)/100.0;
            System.out.println("El precio final correspondiente al Tercer Tramo es de: " + precioEuros + " euros");
        }
        else {
            precioFinal += (precioPrimerTramo + precioSegundoTramo + precioTercerTramo + (mCubicos-1100) * CUARTO_TRAMO);
            precioEuros = Math.round(precioFinal*100.0)/100.0;
            System.out.println("El precio final correspondiente al Cuarto Tramo es de: " + precioEuros + " euros");
        }
    }
}
