package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
		/*
		 * MISSAO 1:
		 * Jogador1 vai digitar um numero
		 * Jogador2 vai ter que advinhar o numero 
		 * Jogador2 so pode receber a mensagem de parabens quando ele acertar
		 *
		 *
		 * MISSAO 2:
		 * Acrescentar dicas para o Jogador2 (numero maior ou menor)
		 * 
		 * MISSAO 3:
		 * Acrescentar na mensagem de parabens, a quantidade de tentativas
		 * Dica: criar uma variavel para contar 
		 *
		 */

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1, digite um numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, advinhe o numero do Jogador1"));
		int contador = 1;

		do {
			contador = contador + 1; //pode ser tbm contador++ ou contador+=1
			if (numero1 > numero2) {
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, é maior que "+ numero2 +". Tente novamente"));
			}else {
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, é menor que "+ numero2 +". Tente novamente"));
			}
		} while (numero1 != numero2);

		System.out.println("Parabens Jogador2! O numero correto é: " + numero2);
		System.out.println("Tentativas até acerto: " + contador);


	}
}
