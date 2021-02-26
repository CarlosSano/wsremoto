package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * nome do produto
		 * genero do produto (alimenticio, eletronico...)
		 * qtd
		 * valor unitario
		 * Voce devera calcular o imposto sobre o valor unitario
		 * Se for alimenticio, o imposto sera de 5%
		 * Se for eletronico, o imposto sera de 7%
		 * Se a qtd for maior que 100, o imposto sera menor em 1%
		 * Se a qtd estiver entre 50 e 100, o imposto sera menor em 0.5%
		 * Se a qtd for menor que 50, o imposto sera integral
		 * Exibir o valor unitario ja com o imposto.
		 */

		String produto = JOptionPane.showInputDialog("Digite o nome do produto").toUpperCase();
		short qtd = Short.parseShort(JOptionPane.showInputDialog("Digite a qtd"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitario"));

		//Nao pode comparar Stringcmo '=='. temque 
		if (produto.equals("ALIMENTICIO")) {

			float imp = (float)0.05;
			float valort;

			if (qtd >=50 && qtd <=100) {
				imp = (float)0.045;
				valort = qtd*valor*(imp-(float)0.005);
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);	
			} else if (qtd >  100) {
				imp = (float)0.04;
				valort = qtd*valor*(imp-(float)0.01);
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);
			} else {
				valort = qtd*valor*imp;
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);
			}

		} else 	if (produto.equals("ELETRONICO")) {

			float imp = (float)0.07;
			float valort;

			if (qtd >=50 && qtd <=100) {
				valort = qtd*valor*(imp-(float)0.005);
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);	
			} else if (qtd >  100) {
				valort = qtd*valor*(imp-(float)0.01);
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);
			} else {
				valort = qtd*valor*imp;
				System.out.println("Produto " + produto + ": Valor unitario com imposto: "+ valort);
			}  
		} 

		/*
		 * ===============DecisaoEncadeadaDesafio=========================
String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		String genero = JOptionPane.showInputDialog("Genero").toUpperCase();
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float taxa=0;
		if (genero.equals("ALIMENTICIO")) {
			if (qtde>100) {
				taxa = (float) 0.04;
			}else if (qtde<50) {
				taxa = (float) 0.05;
			}else {
				taxa = (float) 0.045;
			}
		}else if (genero.equals("ELETRONICO")) {
			if (qtde>100) {
				taxa = (float) 0.06;
			}else if (qtde<50) {
				taxa = (float) 0.07;
			}else {
				taxa = (float) 0.065;
			}
		}else {
			System.out.println("Categoria inválida.");
		}
		
		System.out.println("Valor com imposto: " + (valorUnitario + valorUnitario * taxa));
		 */
	
	}

}
