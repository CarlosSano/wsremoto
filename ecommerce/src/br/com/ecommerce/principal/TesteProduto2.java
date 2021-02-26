package br.com.ecommerce.principal;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto2 {

	public static void main(String[] args) {

		Produto produto = new Produto(
				15,
				"churros",
				(float)5.1,
				(float)6.7,
				5
				);
		
		System.out.println(produto.getResumo());
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
}
