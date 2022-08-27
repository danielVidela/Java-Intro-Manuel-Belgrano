
package guiajavaintroduccion;

/**
 *
 * @author Daniel Videla
 */
public class ej_22 {

    public static void main(String[] args) {
        
        int[] vectorN = new int[100]; 
        //lleno
         System.out.println("****Acendente****");
        for (int i=0;i<100;i++){
        vectorN[i]=i+1;
        //muestro
           
        System.out.print("[" + vectorN[i] + "]");//Es "print" sin "ln" o sea sin saltar de linea
        }
                        
        System.out.println(" ");//este solo lo uso para el salto de linea final
        
        //para mostrarlos de forma descendiente
        System.out.println("****Decendente****");
            for(int i=99;i>=0;i--){
             System.out.print("[" + vectorN[i] + "]");
            }
            System.out.println(" ");
    }
    
}
