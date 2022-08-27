

package guiajavaintroduccion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_14 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // El Código va AQUI!!!
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion;
		do {
			System.out.println("\n\n\n\n\n");
                        System.out.println("*********************");
                        System.out.println("***      MENU     ***");
			System.out.println("*********************");
                        System.out.println("** 1 SUMAR         **");
			System.out.println("** 2 RESTAR        **");
			System.out.println("** 3 MULTIPLICAR   **");
			System.out.println("** 4 DIVIDIR       **");
                        System.out.println("** 5 para SALIR    **");
			System.out.println("*********************");
			System.out.println("Elija Opcion:");
                opcion = leer.nextInt();
                
		switch (opcion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                       System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                       String confirma = leer.next();
                       
                       if ("s".equals(confirma.substring(0,1).toLowerCase())){
                           opcion = 0;
                           break;
                       }
                        
                    default:
                            System.out.println("Ingresaste una opción errónea");
                            System.out.println("Presione ENTER para continuar");
                            System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                
                }
    
		} while (opcion!=0);// Fin Menu por opcion 5
		leer.close();
                System.out.println("\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("*** CHAU!!! ***");
        
    }

}
