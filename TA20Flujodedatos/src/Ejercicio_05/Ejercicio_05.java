/**
 * 
 */
package Ejercicio_05;

/**
 * 
 */
import javax.swing.JOptionPane;
public class Ejercicio_05 {

	/**
	 * 
	 */
	public Ejercicio_05() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numeroStr = JOptionPane.showInputDialog("Introduce un número:");
        int numero = Integer.parseInt(numeroStr);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " es divisible entre 2.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es divisible entre 2.");
        }

	}

}
