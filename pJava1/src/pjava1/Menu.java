package pjava1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            System.out.println("1 - Get water consumption");
            System.out.println("2 - Get temperature");
            System.out.println("3 - Play guess how much");
            System.out.println("4 - End program");

            try {

                System.out.println("Select an option:");

                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Enter the cubic meters consumed:");
                        int mCubicos = lector.nextInt();
                        calculoConsumo(mCubicos);
                        break;
                    case 2:
                        System.out.println("Enter the number of temperatures:");
                        int nTemps = lector.nextInt();
                        calculoTemperatura(nTemps);
                        break;
                    case 3:
                        System.out.println("Guess a number between 1 and 100:");
                        int n = lector.nextInt();
                        adivina(n);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Write a number between 1, 2 or 3:");
                }
            } catch (InputMismatchException e) {
                System.out.println("You need to write a number between 1, 2 or 3");
                lector.next();
            }
        }

        System.out.println("End of program");

//        numAzar := random(MAX) + 1;
/*        Random r = new Random();
        int numAzar = r.nextInt(100);
        System.out.println(numAzar);*/

    }

    private static void adivina(int n) {

        boolean correcto = false;
        int nInicio = n;
        int intentos = 1;
        Scanner lector = new Scanner(System.in);

        Random r = new Random();
        int numAzar = r.nextInt(MAX);
        //System.out.println("el numero aleatorio es " + numAzar);

        while(!correcto){
            if (nInicio == numAzar) {
                correcto = true;
                System.out.println("Correct! The misterious number is " + nInicio);
                if (intentos == 1){
                    System.out.println("BINGO! You have to play lottery today");
                }
                else {
                    System.out.println("You needed " + intentos + " attempts");
                }
            }
            else if (nInicio < numAzar){
                System.out.println("The misterious number is HIGHER than " + nInicio);
                nInicio = lector.nextInt();
            }
            else {
                System.out.println("The misterious number is LOWER than " + nInicio);
                nInicio = lector.nextInt();
            }
            intentos++;
        }
    }

    private static void calculoTemperatura(int nTemps) {

        //DEBE SER MAYOR QUE CERO
        Scanner lector = new Scanner(System.in);
        int[] temperaturas = new int[nTemps];

        for (int t =0; t < nTemps; t++) {
             temperaturas[t] = lector.nextInt();
        }

        int ceroGrados = 0;
        int total = 0;

        for (int t : temperaturas) {
            if (t<0){
                ceroGrados++;
            }
            total+=t;
        }

        double media = (double) total/nTemps;

        System.out.println("Days with temperature below 0 grades: " + ceroGrados);
        System.out.println("Average temperature: " + media);
    }

    public static void calculoConsumo(int mCubicos) {
        double precioFinal = 0;
        double precioPrimerTramo = 100 * PRIMER_TRAMO;
        double precioSegundoTramo = 500 * SEGUNDO_TRAMO;
        double precioTercerTramo = 500 * TERCER_TRAMO;

        if (mCubicos <= 100){
            precioFinal += (mCubicos * PRIMER_TRAMO);
            System.out.println("El precio final correspondiente al Primer Tramo es de: " + precioFinal);
        }
        else if (mCubicos <= 600){
            precioFinal += (precioPrimerTramo + (mCubicos-100) * SEGUNDO_TRAMO);
            System.out.println("El precio final correspondiente al Segundo Tramo es de: " + precioFinal);
        }
        else if (mCubicos <= 1100){
            precioFinal += (precioPrimerTramo + precioSegundoTramo + (mCubicos-600) * TERCER_TRAMO);
            System.out.println("El precio final correspondiente al Tercer Tramo es de: " + precioFinal);
        }
        else {
            precioFinal += (precioPrimerTramo + precioSegundoTramo + precioTercerTramo + (mCubicos-1100) * CUARTO_TRAMO);
            System.out.println("El precio final correspondiente al Cuarto Tramo es de: " + precioFinal);
        }

        //redondear a 2 decimales

    }
}
