
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero");
        int n1 = leer.nextInt();
        
        if (n1%2==0){
            System.out.println("El numero ingresado "+n1+" es PAR");
        }
        else{
            System.out.println("El numero ingresado "+n1+" es IMPAR");
        }
    }
    
}
