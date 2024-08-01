package aula3.tratamentoerros.exceptions;

public class VendaException extends Exception {
	
	public VendaException(String txt) {
		super("Erro: Quantidade inválida, deve ser de 1 à 10.");
	}
	
}
