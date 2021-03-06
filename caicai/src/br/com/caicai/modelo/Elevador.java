package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;

	//devera preencher os atributos andarMaximo, andarMinimo e capacidadeMaxima
	//com os parametro recebidos respectivamente.
	public void configurar(short maximo, short minimo, byte capacidade) {

		andarMaximo = maximo;
		andarMinimo = minimo;
		capacidadeMaxima = capacidade;
	}

	public void preencherNome(String param) {
		nome = param.toUpperCase();
	}

	//o andarAtual devera ser incrementado em 1 somente se o andarAtual nao for igual
	//ao andarMaximo
	public void subir() {

		if (andarAtual < andarMaximo) {
			andarAtual++;
		}
	}



	//o andarAtual devera ser decrementado em 1 somente se o andarAtual nao for igual
	//ao andarMinimo
	public void descer() {

		if (andarAtual > andarMinimo) {
			andarAtual--;
		}
	}

	//devera acrescentar ao andarAtual o parametro recebido, desde que nao exceda o andarMaximo.
	public void subir(byte andar) {

		if ((andarAtual + andar)  < andarMaximo) {
			andarAtual += andar;
		}
	}

	public String retornarNome() {
		return nome;
	}

	//devera acrescentar o valor recebido no atributo qtdePessos, desde que n�� exceda a capacidade maxima.
	public String entrar(byte qtde) {

		if ((qtdePessoas + qtde) <= capacidadeMaxima) {

			qtdePessoas += qtde;
			return "Entra realizada!";
		}
		return "Entrada N�O realizada!";
	}


	//devera remover o valor recebido do atributo qtdePessoas, desde que nao seja menor que 0.
	public String sair(byte qtde) {

		if (qtdePessoas >= qtde) {

			qtdePessoas -= qtde;
			//ou qtdePessoas = qtdePessoas - qtde;
			return "Sa�da realizada!";
		}
		return "Sa�da N�O realizada!";
	}

	//deve exibir: andarAtual, qtdePEssoas e o nome do elevador.
	public String exibirResumo() {
		
		
		return "Nome: " + nome + " | " +
				"Andar atual: " + andarAtual + " | " +
				"Qtde pessoas: " + qtdePessoas;
	}

}
