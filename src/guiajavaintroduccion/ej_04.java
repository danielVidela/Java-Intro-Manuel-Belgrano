
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frace corta");
        String frase = leer.next();
        
        System.out.println("La frase en mayusculas queda "+frase.toUpperCase());
        System.out.println("La frase en minusculas queda "+frase.toLowerCase());
    }
    
}
