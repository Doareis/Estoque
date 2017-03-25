package br.com.estoque.modelo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaFiltros {

	@XmlElement(name="filtro")
	private List<Filtro> filtros;

	public ListaFiltros(List<Filtro> filtros) {
		this.filtros = filtros;
	}

	ListaFiltros() {
	}
	
	public List<Filtro> getLista() {
		return filtros;
	}
	
}