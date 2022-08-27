
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("que temperatura hace?");
        float centigrados = leer.nextInt(); //si declaro uno como entero el resultado da entero
        
        float farenheit = 32+(9*centigrados/5);
        
        
        System.out.println("La temperatura en Farenheit es "+farenheit);
        
        
        
    }
    
}
