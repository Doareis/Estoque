package br.com.estoque.exception;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	private static final long serialVersionUID = -4856585216924043772L;

	public AutorizacaoException(String mensagem){
		super(mensagem);
	}
	
	public String getFaultInfo(){
		return "Erro durante a validacao do token do usuario";
	}
	
}
