
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla    
 */
public class ej_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int nota = 11;
        
        while (nota >= 10 && nota >= 0) {
            System.out.println("Ingrese una nota del 0 a 10");
            nota = leer.nextInt();
        if (nota <= 10 && nota >= 0){
            System.out.println("La nota fue ingresada correctamente");
        }
        
        } 
        
        
    }
    
}
