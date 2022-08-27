
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_12 {

   
    public static void main(String[] args) {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        System.out.println("Ingresa un numero entero");
        int num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}
