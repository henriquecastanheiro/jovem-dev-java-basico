package aula6.outros;

public enum Calculadora1Enum {
	SOMA("Soma", (a, b) -> a + b),
	SUBTRACAO("Subtração", (a, b) -> a - b), 
	DIVISAO("Divisão", (a, b) -> a * b),
	MULTIPLICACAO("Multiplicação", (a, b) -> a / b);
	
	String nomeAmigavel;
	final CalculoInterface calcula;
	
	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calcula) {
		this.nomeAmigavel = nomeAmigavel;
		this.calcula = calcula;
	}
	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	public CalculoInterface getCalcula() {
		return calcula;
	}
	
}
