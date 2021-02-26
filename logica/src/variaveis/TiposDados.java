package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

//atalho main: digitar "main" e depois Crtl+Espa�o
	
	public static void main(String[] args) {
		/*
		 * Alfanumerico: eh um dado que voce nao utiliza em operacoes aritmeticas.
		 * CEP: 00010-009 -->  00010-009 (em que ele nao esteja entre os dados mais criticos)
		 * 
		 * Numerico: eh o dado que pode ser utilizado em operacoes aritmeticas e/ou for dado critico para pesquisa.
		 * CEP: 00010-009 --> 1
		 * (em um contexto dos Correios, onde ele eh um dado critico)
		 * VARIAVEIS:
		 * Inteiro = int
		 * Real = double (casas decimais)
		 * 
		 * JOptionPane = caixa de entrada de dados
		 * Source > Organize Imports
		 * void = nao retorna nada
		 * parse = converter em...
		 * 
		 * Classes Wrappers = apoiam os tipos primitivos
		 * int = Integer
		 * double = Double
		 * float = Float
		 */
		
		//String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		double imc = peso/(altura*altura);
		//Peso
		//criar uma variavel chamada IMC (fazer o calculo)
		//exibir o imc
		
		//*Atalho: sysout + Crtl+Espa�o = System.out.println
		
		//System.out.println("Nome..: " + nome);
		//System.out.println("Idade.: " + idade + " anos");
		System.out.println("Altura: " + altura + " m");
		System.out.println("Peso..: " + peso + " Kg");
		System.out.println("IMC...: " + imc);
		System.out.println();
		
		
	}
	
	
	
	
	
}
