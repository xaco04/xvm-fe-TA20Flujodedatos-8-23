/**
 * 
 */
package Ejercicio_04;

/**
 * 
 */
import javax.swing.JOptionPane;
public class Ejercicio_04 {

	/**
	 * 
	 */
	public Ejercicio_04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radioStr = JOptionPane.showInputDialog("Introduce el radio del círculo:");
        double radio = Double.parseDouble(radioStr);
        double area = Math.PI * Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
	}

}
