package br.com.estoque.modelo;

import javax.xml.bind.annotation.XmlEnumValue;

public enum TipoItem {

	@XmlEnumValue("Livro")
	LIVRO("Livro"), 
	@XmlEnumValue("Celular")
	CELULAR("Celular"),
	@XmlEnumValue("Tablet")
	TABLET("Tablet");
	
	private String nome;

	TipoItem(String nome) { 
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static boolean existe(String valor) {
		try{
			TipoItem.valueOf(valor.toUpperCase());
		}catch(IllegalArgumentException e) {
			return false;
		}
		return true;
	}
}
