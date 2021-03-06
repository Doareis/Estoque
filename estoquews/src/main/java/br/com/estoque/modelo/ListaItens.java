package br.com.estoque.modelo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItens {

	@XmlElement(name="item")
	private List<Item> itens;

	// precisa declarar construtor padrao para que o JAX-B funcione
	public ListaItens() {}
	
	public ListaItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<Item> getItens() {
		return itens;
	}
	
}
