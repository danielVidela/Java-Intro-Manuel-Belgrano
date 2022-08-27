package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        if (n1 > n2) {
            System.out.println("El numero " + n1 + " es el mayor");
        } else {
            System.out.println("El numero " + n2 + " es el mayor");
        }

    }

}
