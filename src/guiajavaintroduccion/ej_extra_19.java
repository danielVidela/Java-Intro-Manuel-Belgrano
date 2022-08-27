
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_19 {
    
    public static void llenaVector(int[] vector, int n){
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10+1);
        }
        
        
    }
    
    public static void muestraVector(int[] vector, int n){
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i] + "] ");
        }
        System.out.println("\n");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de numeros");
        int n = leer.nextInt();
        int[] vector = new int[n];
        llenaVector(vector,n);
        muestraVector(vector,n);
        
    }
    
}
