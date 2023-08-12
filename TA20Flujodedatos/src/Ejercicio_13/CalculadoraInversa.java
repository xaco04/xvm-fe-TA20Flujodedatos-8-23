/**
 * 
 */
package Ejercicio_13;
import javax.swing.JOptionPane;
/**
 * 
 */
public class CalculadoraInversa {

	/**
	 * 
	 */
	public CalculadoraInversa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando:"));
        int operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando:"));
        String operador = JOptionPane.showInputDialog("Introduce el signo aritmético (+, -, *, /, ^, %):");

        double resultado = 0.0;

        switch (operador) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operador no válido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }

}


