/**
 * 
 */
package Ejercicio_12;

/**
 * 
 */
import javax.swing.JOptionPane;

public class Ejercicio_12 {
	/**
	 * 
	 */
	public Ejercicio_12() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String CONTRASEÑA_CORRECTA = "contraseña123";
        final int NUMERO_MAX_INTENTOS = 3;
        
        int intentos = 0;
        boolean contraseñaCorrecta = false;

        while (intentos < NUMERO_MAX_INTENTOS && !contraseñaCorrecta) {
            String contraseñaIngresada = JOptionPane.showInputDialog("Introduce la contraseña:");
            if (contraseñaIngresada.equals(CONTRASEÑA_CORRECTA)) {
                contraseñaCorrecta = true;
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Intentos restantes: " + (NUMERO_MAX_INTENTOS - intentos - 1));
                intentos++;
            }
        }

        if (contraseñaCorrecta) {
            JOptionPane.showMessageDialog(null, "Enhorabuena, contraseña correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "Has agotado todos los intentos. Acceso bloqueado.");
        }
    }

	}


