package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Capturar a qtd de faltas 
		 * Pra que ele esteja aprovado ou de exame, ele tbm precisa que a qtd faltas sejam menor que 20
		 * 
		 * Condições:
		 * && = 2
		 * || = ou
		 * 
		 */

		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de faltas"));
		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina:").toUpperCase();

		if (faltas >= 20) {
			System.out.println("Voce esta reprovado por faltas.");
		} else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
			float media = (nota1 + nota2)/2;

			if (media >= 6) {
				System.out.println("Parabens voce esta aprovado na disciplina: "+ disciplina);
			} else	if (media < 4 || faltas >= 20) {
				System.out.println("Infelizmente voce foi reprovado!");
			} else	{
				System.out.println("Voce ainda tem chance no exame");
			}
			System.out.println("Sua media foi: " + media);
		}
		
		/*
		 * Padroes:
		 * - CamelCase: na composição de mais de uma palavra, da segunda em diante deve se iniciar com letra maiuscula.
		 * Exemplo: datanascimento ==> dataNascimento (correto)
		 * - nomes significativos
		 * - variaveis: devem começar com letras minusculas
		 * - classes: devem começar com letras maiusculas
		 * - métodos: devem ser seguidos por parenteses
		 * 
		 * xpto = variavel
		 * Xpto = classe
		 * xpto() = metodo
		 * 
		 * Regras:
		 * 1) Nao comecaras um nome com numero. Exemplo: 1valor | correto: v1alor
		 * 2) Nao utilizaras palavras reservadas. Exemplo: public, void, int
		 * 3) Nao utilizaras caracteres especiais. Exemplo: d@t@
		 * 
		 * 
		 */
	}

}
