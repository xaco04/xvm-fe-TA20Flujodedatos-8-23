/**
 * 
 */
package Ejercicio_11;

/**
 * 
 */
import javax.swing.JOptionPane;

public class Ejercicio_11 {

	/**
	 * 
	 */
	public Ejercicio_11() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diaSemana = JOptionPane.showInputDialog("Introduce un día de la semana:");
        diaSemana = diaSemana.toLowerCase();

        boolean esLaboral;

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                esLaboral = true;
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                esLaboral = false;
                break;
            default:
                esLaboral = false;
        }

        if (esLaboral) {
            JOptionPane.showMessageDialog(null, diaSemana + " es un día laboral.");
        } else {
            JOptionPane.showMessageDialog(null, diaSemana + " no es un día laboral.");
        }
    }

}

