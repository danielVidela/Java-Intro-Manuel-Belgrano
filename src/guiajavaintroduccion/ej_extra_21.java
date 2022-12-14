
package guiajavaintroduccion;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_21 {

    //Funcion llena con aleatorios una Matriz de indice N x M
    public static int[][] llenaMatriz(int n, int m, int matrix[][]) {
        //matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
        return matrix;
    }

    //Funcion para Mostrar una matriz de indice N x M
    public static void muestraMatriz(int n, int m, int matrix[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
    public static double sumaMatriz(int[][] matriz, int n, int m) {
        double suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
                System.out.println(suma);
            }
        }
        return suma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int n = 5;
        int m = 4;
        double suma;
        int[][] matriz = new int[n][m];
        llenaMatriz(n, m, matriz);
        muestraMatriz(n, m, matriz);
                      
        suma = sumaMatriz(matriz, n, m);
        
        System.out.println("La suma de sus elementos es " + suma);
                
    }

}
