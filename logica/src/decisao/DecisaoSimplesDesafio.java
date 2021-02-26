package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {


		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

		if (idade < 16) {
			System.out.println(nome + ", voce nao pode votar!");
		}

		if (idade >= 18 && idade <= 70) {
			System.out.println(nome + ", seu voto eh obrigatório");
		}

		if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println(nome + ", seu voto eh facultativo");
		}


	}

}
