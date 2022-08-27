
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_19 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
                int a;
		int b;
		int n;
		System.out.println("ingrese un entero");
		n = leer.nextInt();
		for (a=1; a<=n; a++) {
			for (b=1; b<=n; b++) {
				if (a==1 || a==n || b==1 || b==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}

        
    }
    
