
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_01_HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea una un objeto de la clase scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;//variable de tipo cadena 
        
        //Mensaje por pantalla pidiendo ingresar el nombre
        System.out.println("Ingresa tu nombre");
        
        nombre = leer.next();
        
        System.out.println("Hola Mundo, soy "+nombre+" y estoy programando en Java");
        
    }
    
}
