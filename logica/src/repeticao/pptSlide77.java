package repeticao;

import javax.swing.JOptionPane;

public class pptSlide77 {

	public static void main(String[] args) {
		/*
		 * 1�) Crie um programa que pe�a para o usu�rio o dia, m�s e ano em vari�veis separadas. Valide todos os dados e aceite somente dados v�lidos.
		 * 2�) Crie um programa que pergunte a esta��o favorita do ano e, no final, apresente a porcentagem de pessoas que escolheram cada esta��o do ano.
		 * 3�) Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade (M�dio, Superior ou P�s) enquanto a resposta for v�lida, ir� computando os totais dos n�veis digitados, no final apresente somente o n�vel que foi mais votado.
		 * 4�) Monte um programa que solicite a idade e o nome das pessoas. A aplica��� continuara perguntando nome e idade enquanto o usuaro afirmar que deseja continuar 
		 * Ao terminar, a aplicacal devera exibir:
		 * - a quantidade de pessoas maiores de idade
		 * - a media entre todas as idades que foram digitadas
		 * - a pessoa mais experiente (nome e idade)
		 * - a pessoal mais jovem (nome e idade)
		 * 
		 * 
		 */

		byte idade = 0;
		int somaIdade = 0;				//soma idade das pessoas
		int maiorIdade = 0;				//soma quantidade de maior de idade
		String nomeExperiente = "";
		byte idadeExperiente = 0;		//pessoa mais velho

		String nomeJovem = "";
		byte idadeJovem = 0;			//pessoa mais nova
		String nome = "";				//nome da pessoa

		String resposta = ""; 			//Resposta para continuar
		int contador = 0; 				//Contagem de pessoas
		int qtdPessoas = 0; 			//Contagem de 

		do {
			contador = contador + 1;
			idade = Byte.parseByte(JOptionPane.showInputDialog("Pessoa #"+ contador + ", informe a idade"));
			nome = JOptionPane.showInputDialog("Pessoa #"+ contador + ", informe o nome").toUpperCase();

			if (idade < idadeJovem || qtdPessoas == 0) {
				nomeJovem = nome;
				idadeJovem = idade;
			}

			if (idade > idadeExperiente) {
				nomeExperiente = nome;
				idadeExperiente = idade;
			}

			somaIdade = somaIdade + idade;
			qtdPessoas++;

			//Contar quantidade de maior de idade
			if (idade >= 18) {
				maiorIdade++;
			}

			resposta = JOptionPane.showInputDialog("Deseja continuar? S/N").toUpperCase();

		} while (resposta.equals("S"));
		// while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
		// null = para centraizar a janela no meio da tela
		// 0 = YES | 1 = NO

		/*
		JOptionPane.showMessageDialog(null, "Qtd. maior de idade: " + maiorIdade + " | Lista: "+ listaMaior);
		JOptionPane.showMessageDialog(null, "Media de idades: " + (somaIdade/contador));
		JOptionPane.showMessageDialog(null, "Mais Experiente: " + nomeExperiente + " | Idade: " + idadeExperiente);
		JOptionPane.showMessageDialog(null, "Mais Jovem: " + nomeJovem + " | Idade: " + idadeJovem);
		 */

		System.out.println("Qtd. maior de idade: " + maiorIdade);
		System.out.println("Media de idades: " + (somaIdade/contador));
		System.out.println("Mais Experiente: " + nomeExperiente + " | Idade: " + idadeExperiente);
		System.out.println("Mais Jovem: " + nomeJovem + " | Idade: " + idadeJovem);


	}

}
