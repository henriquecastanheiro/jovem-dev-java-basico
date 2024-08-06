package aula5.stream.exceptions;

public class ZeroBertoException extends Exception{
	public ZeroBertoException(String txt) {
		super("Nenhum nome termina com 'berto'.");
	}
}
