package guiajavaintroduccion;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Daniel Videla
 */
public class ej_18 {

    public static void main(String[] args) throws InterruptedException {
        int a = 0;
        do {
            for (int i = 0; i <= 9; i++) {
                a++;
                String convI = String.valueOf(i); //convierto i a cadena
                if (i == 3) {//si i toma el valor de 3 su equivalente convertido le asigno la letra E
                    convI = "E";
                }
                for (int j = 0; j <= 9; j++) {
                    String convJ = String.valueOf(j);//convierto j a cadena
                    if (j == 3) {//si j toma el valor de 3 su equivalente convertido le asigno la letra E
                        convJ = "E";
                    }
                    for (int k = 0; k <= 9; k++) {
                        String convK = String.valueOf(k);//convierto k a cadena
                        TimeUnit.SECONDS.sleep(1);//mando a dormir un segundo para que parezca un reloj
                        if (k == 3) {
                            convK = "E";//si k toma el valor de 3 su equivalente convertido le asigno la letra E
                        }
                        System.out.println("CONTADOR: " + convI + " - " + convJ + " - " + convK);
                    }
                }
            }

        } while (a <= 9);

    }

}
