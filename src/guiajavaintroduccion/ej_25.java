package guiajavaintroduccion;

/**
 *
 * @author Daniel Videla
 *
 */
public class ej_25 {

    //Funcion llena con aleatorios una Matriz cuadrada de indice N 
    public static int[][] llenaMatriz(int matrix[][], int n) {
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 99 + 1);
            }
        }
        return matrix;
    }

    //Funcion para Mostrar una matriz cuadrada de indice N
    public static void muestraMatriz(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = 4;
        int[][] matriz = new int[n][n];

        matriz = llenaMatriz(matriz, n);

        System.out.println("la matriz generada es:");
        muestraMatriz(matriz, n);
        System.out.println("");
        System.out.println("Su transpuesta es:");
        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
    }

}
