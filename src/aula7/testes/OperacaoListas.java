package aula7.testes;

import java.util.List;

public class OperacaoListas {
	/*
	 * Crie uma classe chamada OperacaoListas, que vai ter três métodos,
	 * correspondentes aos três primeiros exercícios de Optional/Stream.
	 * 
	 * Na classe de testes, teste esses três métodos usando uma lista criada por
	 * você.
	 */
	Integer somarNumeros(List<Integer> lista) {
		return lista.stream().mapToInt(Integer::intValue).sum();
	}

	double mediaNumerosMaiores50(List<Integer> lista) {
		// Calcular a média dos números maiores que 50
		return lista.stream().filter(n -> n > 50).mapToInt(Integer::intValue).average().orElse(0);

	}

	Integer contarNumero25(List<Integer> lista) {
		return (int) lista.stream().filter(n -> n == 25).count();
	}
}
