package br.com.estoque.main;

import javax.xml.ws.Endpoint;

import br.com.estoque.ws.EstoqueWS;

public class Main {

	private static final String ADDRESS = "http://localhost:8080/estoquews";

	public static void main(String[] args) {
		System.out.println("Servidor rodando");
		Endpoint.publish(ADDRESS, new EstoqueWS());
	}
}
