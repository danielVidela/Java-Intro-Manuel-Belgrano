
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame un frase o palabra de 8 letras");
        String frase = leer.next();
        
        if (frase.length()==8){
            System.out.println("CORRECTO!!");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
        
        
    }
    
}
