package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el tipo de motor de 1 a 4");
        int motor = leer.nextInt();

        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");

        }

    }

}
