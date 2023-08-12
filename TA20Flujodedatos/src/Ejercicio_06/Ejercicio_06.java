/**
 * 
 */
package Ejercicio_06;

/**
 * 
 */
import javax.swing.JOptionPane;
public class Ejercicio_06 {

	/**
	 * 
	 */
	public Ejercicio_06() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final double IVA = 0.21; 

        String precioBaseStr = JOptionPane.showInputDialog("Introduce el precio del producto:");
        double precioBase = Double.parseDouble(precioBaseStr);

        double precioConIVA = precioBase * (1 + IVA);

        JOptionPane.showMessageDialog(null, "El precio final con IVA es: " + precioConIVA);

	}

}
