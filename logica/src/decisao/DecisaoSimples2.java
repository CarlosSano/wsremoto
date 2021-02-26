package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * - Nome da uma disciplina
		 * - duas notas
		 * - calcular a media
		 * - exibir a media
		 * - exibir a mensagem "Parabens" somente se a media for maior ou igual 6
		 */

		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		float media = (nota1 + nota2)/2;

		if (media >= 6) {
			System.out.println("Disciplina - "+ disciplina + " Parabens!: " + media);
		}

		if (media < 4) {
			System.out.println("Infelizmente voce foi reprovado!");
		}

		if (media < 6 && media >=4) {
			System.out.println("Voce ainda tem chance no exame");
		}
		System.out.println("Sua media foi: " + media);


	}

}
