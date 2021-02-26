package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		
		//
		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina:").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		float media = (nota1 + nota2)/2;

		if (media >= 6) {
			System.out.println("Parabens voce esta aprovado na disciplina: "+ disciplina);
		} else	if (media < 4) {
			System.out.println("Infelizmente voce foi reprovado!");
		} else	{
			System.out.println("Voce ainda tem chance no exame");
		}
		System.out.println("Sua media foi: " + media);
		
		

	}

}
