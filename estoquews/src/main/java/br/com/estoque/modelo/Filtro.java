package br.com.estoque.modelo;


public class Filtro {

	private TipoItem tipo;
	private String nome;

	public TipoItem getTipo() {
		return tipo;
	}

	public void setTipo(TipoItem tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}