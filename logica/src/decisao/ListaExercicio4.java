package decisao;

import javax.swing.JOptionPane;

public class ListaExercicio4 {

	public static void main(String[] args) {
		// Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente. 

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o valor: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o valor: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3o valor: "));
		int maior = 0;
		int medio = 0;
		int menor = 0;

		//express�o de diferente = !=


		if (valor1 == valor2 || valor2 == valor3 || valor3 == valor1) {
			System.out.println("Existem valores iguais");
		}

		if (valor1 > valor2 && valor1 > valor3) {
			if (valor2 > valor3) {
				maior = valor1;
				medio = valor2;
				menor = valor3;
			} else {
				maior = valor1;
				medio = valor3;
				menor = valor2;
			}
		} else if (valor2 > valor1 && valor2 > valor3) {
			if (valor1 > valor3) {
				maior = valor2;
				medio = valor1;
				menor = valor3;
			} else {
				maior = valor2;
				medio = valor3;
				menor = valor1;
			}
		} else if (valor3 > valor1 && valor3 > valor2){
			if (valor1 > valor2) {
				maior = valor3;
				medio = valor1;
				menor = valor2;
			} else {
				maior = valor3;
				medio = valor2;
				menor = valor1;
			}
		} 

		System.out.println("Ordem decrescente: " + maior + " " + medio + " " + menor);	

	}


}

