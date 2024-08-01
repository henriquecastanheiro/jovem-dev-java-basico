package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends RuntimeException {

	public PrecoIncorretoException(String txt) {
		super("Erro: valor não pode ser menor ou igual a zero.");
	}
	
}
