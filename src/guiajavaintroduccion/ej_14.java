
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_14 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        System.out.println("Ingrese el limite inicial");
        int limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero");
                int n1 = leer.nextInt();
                suma = suma + n1;
                
        }while (limite>suma);
        
    }
    
}
