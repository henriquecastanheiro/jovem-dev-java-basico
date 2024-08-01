package aula3.tratamentoerros.exceptions;

public class ZeroException extends ArithmeticException {

	public ZeroException(String txt) {
		super("O segundo número não pode ser zero!");
	}
}
