package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaDesafio {

	public static void main(String[] args) {
		/*
		 * Capture 2 times e os seus respectivos placares;
		 * Exiba
		 * - Time 1 venceu
		 * ou
		 * - Time 2 venceu
		 * ou
		 * - Houve um empate
		 * 
		 * 
		 */

		String time1 = JOptionPane.showInputDialog("Digite o time 1");
		int placar1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar do time 1"));
		String time2 = JOptionPane.showInputDialog("Digite o time 2");
		int placar2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o placar do time 2"));
		
		if (placar1 > placar2) {
			System.out.println("Vencedor: " + time1 + " | Placar: " + placar1 + " a " + placar2);
		} else if (placar1 < placar2) {
			System.out.println("Vencedor: " + time2 + " | Placar: " + placar2 + " a " + placar1);
		} else {
			System.out.println("Houve um empate. " + time1 + " vs " + time2 + " | Placar: " + placar1 + " a " + placar2);
		}
				
		
	}

}
