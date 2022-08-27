
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de minutos a analizar");
        int min = leer.nextInt();
        
        int hr = (int)Math.floor(min/ 60);
        int dias = hr /24;
        
        //verifico si las horas se pasan de 24, 
        //le asigno el resultado de hr - 24 
        if (hr>=24){
            hr -= 24;
            }
        
        System.out.println(min+" minutos, en dias es "+dias+" dias, y "+hr+" horas");
        
    }
    
}
