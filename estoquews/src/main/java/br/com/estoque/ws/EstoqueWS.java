package br.com.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.ResponseWrapper;

import br.com.estoque.dao.ItemDAO;
import br.com.estoque.dao.TokenDAO;
import br.com.estoque.exception.AutorizacaoException;
import br.com.estoque.modelo.Item;
import br.com.estoque.modelo.ListaFiltros;
import br.com.estoque.modelo.TokenUsuario;
import br.com.estoque.validation.ItemValidador;

@WebService
public class EstoqueWS {

	private ItemDAO dao = new ItemDAO();
	
	@WebMethod(operationName="buscaItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name="ïtem")
	public List<Item> getItens(@WebParam(name="filtros") ListaFiltros filtros){
		return dao.todosItens(filtros.getLista());
	}
	
	@WebMethod(operationName="cadastraItem")
	@WebResult(name="item")
	public Item adicionaItem(
			@WebParam(name="tokenUsuario", header=true) TokenUsuario token, 
			@WebParam(name="item") Item item) 
					throws AutorizacaoException{
		
		if(new TokenDAO().ehValido(token) == false){
			throw new AutorizacaoException("Erro no token do usuario");
		}
		
		new ItemValidador(item).validate();
		
		dao.cadastrar(item);
		
		return item;
	}
}
