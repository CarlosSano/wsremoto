package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		/*
		 * Capturar nome e idade
		 * Requisitos para o final exibir o nome e a idade
		 * - nome deve possuir no minimo 5 caracteres
		 * - nome deve possuir no maximo 15 caracteres
		 * - nome deve possuir um "espa�o"
		 * - idade deve estar entre 18 e 70 anos
		 * 
		 */

		String nomeCompleto = JOptionPane.showInputDialog("Digite o nome e sobrenome");
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a idade"));

		/*
		while (idade <= 18 || idade >= 70) {
			idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a idade novamente"));
		}
		 */
		if (idade <= 18 || idade >= 70) {
			System.out.println("N�o compativel com requisitos");
		} else {
			while (nomeCompleto.length() < 5 || nomeCompleto.length() > 15 || nomeCompleto.contains(" ") == false){

				nomeCompleto = JOptionPane.showInputDialog("Digite o nome e sobrenome novamente");
			}

		}

		System.out.println("Nome: "+ nomeCompleto + " | Idade: "+ idade);
	}



}


