package br.com.ecommerce.principal;

import br.com.ecommerce.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(
				1,
				"Carlos",
				"carlos.sano@itau-unibanco.com.br",
				"11 1234-5678"
				);
				
		System.out.println(cliente.getAll());
		System.out.println(cliente.getUsuario());

	}

}