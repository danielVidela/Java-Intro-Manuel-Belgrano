package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_04 {

    public static void main(String[] args) {
        // El Código va AQUI!!!

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa un numero del 1 al 10");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + " En romanos es I");
                break;
            case 2:
                System.out.println(num + " En romanos es II");
                break;
            case 3:
                System.out.println(num + " En romanos es III");
                break;
            case 4:
                System.out.println(num + " En romanos es IV");
                break;
            case 5:
                System.out.println(num + " En romanos es V");
                break;
            case 6:
                System.out.println(num + " En romanos es VI");
                break;
            case 7:
                System.out.println(num + " En romanos es VII");
                break;
            case 8:
                System.out.println(num + " En romanos es VIII");
                break;
            case 9:
                System.out.println(num + " En romanos es IX");
                break;
            case 10:
                System.out.println(num + " En romanos es X");
                break;
            default:
                System.out.println("Ingresaste un valor que no corresponde");

        }
        leer.close();
    }

}
