
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m, num, fibonacci;
        String fibo = "";
        // n - 1 = n
        // n - 2 = m
        Scanner scan = new Scanner(System.in);
        n = 1;
        m = 1;
        System.out.println("Ingrese hasta donde quiere imprimir");
        num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                n = 1;
                m = 0;
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            } else {
                fibonacci = n + m;
                m = n;
                n = fibonacci;
            }
            if (i < (num - 1)) {
                fibo += Integer.toString(fibonacci) + " - ";
            } else {
                fibo += Integer.toString(fibonacci);
            }
        }
        System.out.println("Primeros "+num+" numeros de Fibonacci:");
        System.out.println(fibo);
        scan.close();
            
    }
    
}
