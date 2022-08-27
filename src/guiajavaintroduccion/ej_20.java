
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_20 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        int num;

        while (contador < 4) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            for (int i = 0; i <= num; i++) {
                if (i == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
            contador = contador + 1;
        }

    }
        
        
    }

