package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		//*Atalho para identaçao: Crtl+i
		String email = JOptionPane.showInputDialog("Digite o email");
		
		if (email.contains("@")==true) {
			System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		
			
		}

	}

}
