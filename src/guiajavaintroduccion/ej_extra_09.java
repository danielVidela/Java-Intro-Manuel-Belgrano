
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_09 {

    
    public static void main(String[] args) {
        
        int resto, cociente = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el dividendo");
        int dividendo = leer.nextInt();
        System.out.println("Ingresa el divisor");
        int divisor = leer.nextInt();

        resto = dividendo;

        if (dividendo > divisor) {

            while (resto > divisor) {
                resto = resto - divisor;
                cociente++;
            }
        } else {
            System.out.println("El dividendo debe ser mayor que el divisor");
        }
        if (resto==divisor){
            cociente++;
            resto=0;
        }
        System.out.println(dividendo + " / " + divisor + " = " + cociente);
        System.out.println("con un resto de " + resto);

    }

}
