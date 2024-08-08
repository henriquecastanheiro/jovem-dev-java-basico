package aula7.testes;

import java.util.List;
import aula7.testes.exceptions.ZeroBertoException;

public class Exercicio2 {
	/*
	 * Altere o Exercicio 5 da aula de Optional/Stream 
	 * para criar um método que recebe uma lista de String
	 * e retorna uma String, disparando ZeroBertoException 
	 * caso não encontre um “berto”.
	 * 
	 * Crie um arquivo de testes para verificar se esse 
	 * método se comporta corretamente. 
	 * 
	 * ● Lista vazia, lista sem bertos: Exception 
	 * ● Lista com um berto: Esse elemento 
	 * ● Lista com dois bertos: O primeiro berto
	 */

	public String encontreBerto(List<String> lista) {
			return lista.stream().filter(nome -> nome.toLowerCase().endsWith("berto"))
					.findFirst().orElseThrow(ZeroBertoException::new);
	}
}

