
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_23 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int n,busq,cont = 0;
        boolean bandera = false;
        System.out.println("Ingresa el tamaño del arreglo");
        n=leer.nextInt();
        
        int[] vectorN = new int[n];
        
        //lleno con enteros aleatorios del 1 al 60
        for (int i=0;i<n;i++){
        //fuerzo que los generados sean enteros con (int) y luego limito que sean
        //desde 0 a 60 los aleatorios pero al final le sumo +1 para que nunca
        //me toque el 0 como aleatorio
            vectorN[i]=(int)(Math.random()*60)+1;
        }
        
        System.out.println("Ingresa el numero a buscar");
        busq=leer.nextInt();
            for (int i=0;i<vectorN.length;i++){
                
                if (vectorN[i]==busq){
                    cont++;
                    System.out.println("Se encontro el numero en "+cont+" oportunidades");
                    System.out.println("En la posicion "+i);
                     
                }else
                {
                   bandera = true;                                
                }
                
            }
            
            if (bandera==true && cont==0){
                
                System.out.println("No se encontro el Numero buscado "+busq);
                System.out.println("en el vector ");
                //muestro el vector
                for (int i=0;i<vectorN.length;i++){
                System.out.print("[" + vectorN[i] + "]");
                }
                System.out.println("");
            }
    }
}
