package variaveis;

//import javax.swing.JOptionPane;

public class TipoString {

	public static void main(String[] args) {

		String email = "carlosSano@gmail.com";
		// String � um tipo de Refer�ncia
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 3� ao 5�: " + email.substring(2,5));
		System.out.println("Exibir do 5� at� o fim: " + email.substring(4));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Nome do usu�rio: " + email.toLowerCase().substring(0, email.indexOf("@")));
		System.out.println("Comparando primitivos: " + (7==8));
		System.out.println("Comparando Strings: " + email.equalsIgnoreCase("HumBerTo@fiAp.cOm.br"));


	}

}
