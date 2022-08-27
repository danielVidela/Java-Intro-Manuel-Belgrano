

package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Como te llamas?");
        String nombre = leer.next();
        System.out.println("Mucho gusto "+nombre +", Mi nombre es Daniel ☺");
        
        
    }
    
}
