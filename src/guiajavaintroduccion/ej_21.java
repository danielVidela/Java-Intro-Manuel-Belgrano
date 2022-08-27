
package guiajavaintroduccion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_21 {

   
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double euros;
	int opcion;
       //mansomenu      
       do {
			
                        System.out.println("*********************");
                        System.out.println("*** CAMBIO  EUROS ***");
			System.out.println("*********************");
                        System.out.println("** 1 A LIBRAS      **");
			System.out.println("** 2 A DOLARES     **");
			System.out.println("** 3 A YENES       **");
			System.out.println("** 4 para SALIR    **");
			System.out.println("*********************");
			System.out.println("Elija Opcion:");
                opcion = leer.nextInt();
                
		switch (opcion){
                    case 1:
                        System.out.println("Ingrese los Euros a convertir a Libras");
                        euros = leer.nextDouble();
                        System.out.println("\n");
                        System.out.println(euros+" € en Libras es "+cambioeuro(euros,opcion) );
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                        break;
                    case 2:
                        System.out.println("Ingrese los Euros a convertir a Dolares");
                        euros = leer.nextDouble();
                        System.out.println("\n");
                        System.out.println(euros+" € en Dolares es "+cambioeuro(euros,opcion) );
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                        break;
                    case 3:
                        System.out.println("Ingrese los Euros a convertir a Yenes");
                        euros = leer.nextDouble();
                        System.out.println("\n");
                        System.out.println(euros+" € en Yenes es "+cambioeuro(euros,opcion) );
                        System.out.println("Presione ENTER para continuar");
                        System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                        break;
                    case 4:
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
               
                System.out.println("*** Gracias por usar software de Daniel Videla!!! ***");                             
     
    
}

    /* 
    Esta es la funcion o metodo cambioeuro es estatica porque tiene una variable
    "cambio" definida en su interior que va a retornar
    */

   
static double cambioeuro (double euros, int opcion) {
        double cambio = 0.0;  
        final double libra,dolar,yen;
        libra = 57;
        dolar = 1.28611;
        yen = 129.852;
        switch (opcion) {
		case 1: cambio=libra*euros;
                        break;
		case 2:
			cambio=dolar*euros;
			break;
		case 3:
			cambio=yen*euros;
			break;
		default:
    }
return cambio;
       }
}