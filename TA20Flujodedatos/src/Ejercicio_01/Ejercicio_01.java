/**
 * 
 */
package Ejercicio_01;
/**
 * 
 */
public class Ejercicio_01 {
	/**
	 * 
	 */
	public Ejercicio_01() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numero1 = 5;
        int numero2 = 8;

        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero1 < numero2) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales: " + numero1 + " = " + numero2 + ".");
        }
	}
}
