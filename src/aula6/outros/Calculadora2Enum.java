package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
	SOMA("Soma", ),
	SUBTRACAO("Subtração"), 
	DIVISAO("Divisão"),
	MULTIPLICACAO("Multiplicação");
	
	String nomeAmigavel;

	BiFunction<Integer, Integer, Integer>calculo;

	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}
	
	
}
