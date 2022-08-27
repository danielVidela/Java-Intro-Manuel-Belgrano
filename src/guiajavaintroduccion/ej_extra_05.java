
package guiajavaintroduccion;

import java.util.Scanner;

/**
 *
 * @author Daniel Videla
 */
public class ej_extra_05 {

    
    public static void main(String[] args) {
        // El Código va AQUI!!!
        
        double descuento = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tipo de socio A - B - C ");
        String socio = leer.next();
        socio = socio.toUpperCase();//paso a mayusculas
        socio = socio.substring(0, 1);//extraigo el primer caracter
        System.out.println("Ingrese el monto del tratamiento");
        double tratamiento = leer.nextInt();

        switch (socio) {
            case "A":
                descuento = (tratamiento * 0.50);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "B":
                descuento = (tratamiento * 0.35);
                System.out.println("Total a pagar $ " + (tratamiento - descuento));
                break;
            case "C":
                
                System.out.println("Total a pagar $ " + tratamiento);
                break;
            default:
                System.out.println("No existe el tipo de socio");
        }
    }
}
    
