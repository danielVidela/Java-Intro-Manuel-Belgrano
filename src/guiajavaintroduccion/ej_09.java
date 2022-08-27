package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Dame un frase");
        String frase = leer.next();

        if ("eureka".equals(frase.toLowerCase())) {
            System.out.println("CORRECTO!!");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
