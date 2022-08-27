
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();

        while (num > 0) {
            num = num / 10;
            contador++;
        }
        System.out.println("El numero ingresado tiene " + contador + " dígitos");

    }

}
