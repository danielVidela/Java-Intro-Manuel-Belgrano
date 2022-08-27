

package guiajavaintroduccion;

/**
 *
 * @author Daniel Videla
 * 
 */
public class ej_extra_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5,b=8,c=6,d=4,aux=0;
        System.out.println("  A = "+a);
        System.out.println("  B = "+b);
        System.out.println("  C = "+c);
        System.out.println("  D = "+d);
        System.out.println("*********");
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("  A = "+a);
        System.out.println("  B = "+b);
        System.out.println("  C = "+c);
        System.out.println("  D = "+d);
        
    }

}
