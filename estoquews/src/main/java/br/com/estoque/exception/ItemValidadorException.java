package br.com.estoque.exception;

import java.util.List;

public class ItemValidadorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ItemValidadorException(List<String> erros) {
		super(erros.toString());
	}
	
}