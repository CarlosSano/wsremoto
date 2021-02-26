package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		/*
		 * For: proprio para situacoes onde nao ha interacao com o usuario final
		 * Sintaxe:
		 * - definir o contador e o iniocio
		 * - condicao
		 * - como ele vai contar?
		 *    
		 */

		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		// 7x1 = 7
		// 7x2 = 14
		for (int contador = 1; contador < 11; contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
		
		
		
		
		
		
		
		
	}

}
