
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_11 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase");
        String frase = leer.next();
        
        frase = frase.toUpperCase();
        
        if ("A".equals (frase.substring(0,1))){
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("INCORRECTO");
        }
    }
    
}
