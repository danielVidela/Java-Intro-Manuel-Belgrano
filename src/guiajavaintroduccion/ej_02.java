

package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros enteros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        
        int suma = n1+n2;
        
        System.out.println("La suma de los dos numeros es "+suma);
        
    }
    
}
