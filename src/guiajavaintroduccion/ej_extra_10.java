
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // El Código va AQUI!!!

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("***************************************");
        System.out.println("**  Vamos a Jugar a las adivinanzas  **");
        System.out.println("***************************************");
        System.out.println("**yo voy a genera dos numeros al azar**");
        System.out.println("** como pista solo seran del 1 al 10 **");
        System.out.println("***************************************");
        System.out.println("**vos tenes que adivinar el resultado**");
        System.out.println("**  de multiplicar esos dos numeros  **");
        System.out.println("***************************************\n");
        System.out.println("ESTAS LISTO?? S/N");
        String confirma = leer.next();

        if ("s".equals(confirma.substring(0, 1).toLowerCase())) {
            int num1 = (int) (Math.random() * 10) + 1;
            int num2 = (int) (Math.random() * 10) + 1;
            do {
                System.out.println("Adivina el resultado");
                int num = leer.nextInt();
                if (num == num1 * num2) {
                    confirma = "s";
                    System.out.println("ADIVINASTE FELICITACIONES!!");
                } else {
                    System.out.println("...mmm, ese no es el resultado...");
                    System.out.println("queres volverlo a intentar? S/N");
                    confirma = leer.next().substring(0, 1).toLowerCase();
                }
            } while ("s".equals(confirma));

        }

        //Genero dos numeros aleatorios fuerzo que sean enteros con (int) y luego limito que sean
        //desde 0 a 10 pero al final le sumo +1 para que nunca me toque el numero 0 
    }

}
