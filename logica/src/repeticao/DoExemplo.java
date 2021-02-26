package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
		/*
		 * Sempre iniciar a variavel com algum valor = "" 
		 */

		String resposta = null;
		float salario = 0;
		
		do {
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			System.out.println("FGTS: " + (salario * 0.008));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").toUpperCase();
		} while (resposta.equals("S"));



	}

}
