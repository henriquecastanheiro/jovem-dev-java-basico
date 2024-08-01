package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {
	/*
	 * Crie uma interface funcional chamada Mostrador, que deve conter um método
	 * chamado mostra que recebe uma string Na sua classe principal, crie uma lista
	 * com 5 strings. Implemente a interface funcional Mostrador para que ela exiba
	 * uma string em maiúsculas. Utilize o forEach da lista para chamar essa função.
	 */
	public static void main(String[] args) {
		
	List<String> lista = new ArrayList<>();
	
	lista.add("castanheiro");
	lista.add("cardoso");
	lista.add("nunes");
	lista.add("vicente");
	lista.add("machado");
	
	// Implementando a interface Mostrador como uma lambda
	Mostrador mostrador = m -> m.toUpperCase();
	// Usando forEach para iterar sobre a lista e chamar o método mostra
	lista.forEach(s -> System.out.println(mostrador.mostra(s)));
	
	}
}
