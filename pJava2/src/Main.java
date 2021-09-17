import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String args[]){

        int opcion = 0;
        boolean salir = false;
        Scanner lector = new Scanner(System.in);

        System.out.println("Establece una velocidad de recta para el coche:");
        int vr = lector.nextInt();
        System.out.println("Establece una velocidad de curva para el coche:");
        int vc = lector.nextInt();

        Coche c = new Coche(vr,vc);

        while (!salir) {

            System.out.println("1 - Acelera recta");
            System.out.println("2 - Frena recta");
            System.out.println("3 - Acelera curva");
            System.out.println("4 - Frena curva");
            System.out.println("5 - Mejora coche");
            System.out.println("6 - Calcular tiempo en recta");
            System.out.println("7 - Calcular tiempo en curva");
            System.out.println("8 - Salir del menú");
            System.out.println("=============================");
            System.out.println(c.toString());

            try {

                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        c.aceleraRecta();
                        break;
                    case 2:
                        c.frenaRecta();
                        break;
                    case 3:
                        c.aceleraCurva();
                        break;
                    case 4:
                        c.frenaCurva();
                        break;
                    case 5:
                        c.mejoraCoche();
                        break;
                    case 6:
                        System.out.println("¿Cuántos KMs tiene la recta?");
                        int k = lector.nextInt();
                        System.out.println("El coche tardará " + c.calculaRecta(k) + " segundos en recorrer la recta.");
                        break;
                    case 7:
                        System.out.println("¿Cuántos KMs tiene la curva?");
                        int j = lector.nextInt();
                        System.out.println("El coche tardará " + c.calculaCurva(j) + " segundos en recorrer la curva.");
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Write a number between 1 and 8:");
                }
            } catch (InputMismatchException e) {
                System.out.println("You need to write a number between 1 and 8");
                lector.next();
            }
        }

        System.out.println("End of program");
    }
}
