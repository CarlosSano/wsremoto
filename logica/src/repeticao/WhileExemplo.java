package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		/* Atalhos: 
		 * JOptioPane = jopt + Crtl+Esoa�o
		 * 
		 */


		String email = JOptionPane.showInputDialog("Digite o e-mail").toLowerCase();
		while (email.contains("@") == false) {
			email = JOptionPane.showInputDialog("E-mail tem que ter @").toLowerCase();
		}

		System.out.println("E-mail: " + email);

		
		

	}

}