package pruebacompuesta;
import java.util.Scanner;

/**
 * @author ASAG
 */

public class PruebaCompuesta {

    public void IFELSE() {

        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca un valor entero PORFA: ");
        numero = entrada.nextInt();
        
        if (numero > 0) {
            System.out.println(numero + " es mayor que cero mi amigo");
            System.out.println("Pruebe de nuevo introduciendo un número negativo");
        } else if (numero < 0) {
            System.out.println(numero + " es menor que cero chabal");
            System.out.println("Pruebe de nuevo introduciendo un número positivo");
        } else {
            System.out.println(numero + " es igual a cero :c");
            System.out.println("¿Por qué no introduce un número negativo?");
        }
    }
    public static void main(String[] args) {
        PruebaCompuesta aprob = new PruebaCompuesta();
        aprob.IFELSE();
    }

}
