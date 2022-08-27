
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_17 {

  
    @SuppressWarnings("empty-statement")//pongo esto para que no me muestre advertencias 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String rs232 = "";
        String fde = "&&&&&";
        int contCorrecto = 0;
        int contIncorrecto = 0;
       
        do {//hacer
            System.out.println("Ingrese una Secuencia de 5 caracteres que comience con X y termine con O");
                rs232 = leer.next();
                rs232 = rs232.toUpperCase();
                
                //Si el conteo de caracteres de rs232 es igual a 5
                if (rs232.length()==5){
                        //si el primer caracter es X y el Ultimo es O, cuento correcto                
                        if (rs232.charAt(0)=='X' && rs232.charAt(rs232.length()-1)=='O'){
                            contCorrecto=contCorrecto+1;
                            }
                        else{
                            contIncorrecto=contIncorrecto+1;//sino cuento incorrecto
                            }
                }else{
                     contIncorrecto=contIncorrecto+1;//sino cuento incorrecto
                     }
        //Mientras el contenido de rs232 sea distinto a fde
        }while(!rs232.equals(fde)); 
        
        leer.close();//cierro el scanner porque ya no lo voy a usar mas
        
        System.out.println("Se capturó la secuencia FDE");
        System.out.println("La suma de las secuencias correctas es "+contCorrecto);
        System.out.println("La suma de las secuencias incorrectas es "+contIncorrecto);
        }
}