/**
 * 
 */
package Ejercicio_10;

/**
 * 
 */
import javax.swing.JOptionPane;
public class Ejercicio_10 {

	/**
	 * 
	 */
	public Ejercicio_10() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String numeroDeVentasStr = JOptionPane.showInputDialog("Introduce el número de ventas a ingresar:");
        int numeroDeVentas = Integer.parseInt(numeroDeVentasStr);

        double sumaVentas = 0.0;

        for (int i = 1; i <= numeroDeVentas; i++) {
            String ventaStr = JOptionPane.showInputDialog("Introduce el monto de la venta " + i + ":");
            double venta = Double.parseDouble(ventaStr);
            sumaVentas += venta;
        }

        JOptionPane.showMessageDialog(null, "La suma total de las ventas es: " + sumaVentas);
	    

	}

}
