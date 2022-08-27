package guiajavaintroduccion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_03 {

    public static void main(String[] args) throws IOException {
        // El Código va AQUI!!!
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa una letra");
        String var = leer.nextLine();
        var = var.toUpperCase();
        var = var.substring(0, 1);

        switch (var) {
            case "A":
                System.out.println(var + " Es la primera Vocal");
                break;
            case "E":
                System.out.println(var + " Es la segunda Vocal");
                break;
            case "I":
                System.out.println(var + " Es la tercer Vocal");
                break;
            case "O":
                System.out.println(var + " Es la cuarta Vocal");
                break;
            case "U":
                System.out.println(var + " Es la quinta Vocal");
                break;
            default:
                System.out.println("No hay vocal");
                System.out.println("Presione ENTER para continuar");
                System.in.read();// espera un Enter, no cualquier tecla
        }
    }

}
