package br.com.concessionaria.modelo;

public class Carro {

	/*
	 * As variaveis precisam ser construidas exatamente como declarado na Classe do UML
	 * 
	 */

	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;

	public void ligar() {
		status = true;
	}

	public void desligar() {
		status = false;
		velocidadeAtual = 0;
	}

	public String retornarCor() {
		return cor;
	}

	//sintaxe para os métodos
	//<modificador> <tipo do retorno> <nome do metodo> (tipo de param) { }
	public void preencherCor(String param) {
		cor = param.toUpperCase();

	}


	public float retornaValor() {
		return valor;
	}

	public void preencherValor(float param) {

		if (param > 0) {
			valor = param;	
		}
	}




	public void acelerar (short velocidade) {

		if (status == true) {
			velocidadeAtual = velocidade;	
		}

	}

	public void brecar(short velocidade) {

		if (status == true) {
			velocidadeAtual = 0;	
		}
	}


	public String retornarResumo() {
		
		String strstatus = "LIGADO";
		if (status == false) {
			strstatus = "DESLIGADO";
			
		}
		
		
		
		
		return "Modelo: " + modelo + " | Status: "+ strstatus + " | Velocidade: " + velocidadeAtual;

	}

/*
 * 
 * 	public String retornarResumo() {
		
		String strstatus = "LIGADO";
		if (status==false) {
			strstatus="DESLIGADO";
		}
		
		return "Modelo: " + modelo + 
				"\nStatus: "+ strstatus + 
				"\nVelocidade: " + velocidadeAtual;
	}
	
	public void brecar(short velocidade) {
		if (status==true && velocidadeAtual>=velocidade) {
			velocidadeAtual = (short) (velocidadeAtual-velocidade);
		}
	}
	
	public void acelerar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
	}
	
	public void desligar() {
		status=false;
		velocidadeAtual=0;
	}
	
	public void ligar() {
		status=true;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}
	
	
	public String retornarCor() {
		return cor;
	}
	
	

	
	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}
 * 
 * 
 * 
 */






}


