package aula5.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExemploStreamTerminal {

	public static void main(String[] args) {
												/* * ********************* 
												 *  				     * 	
												 *  OPERAÇÕES TERMINAL   *
												 *  			   	     * 
												 * ***********************/
		new ExemploStream();
	}

	public ExemploStreamTerminal() {

		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		lista.add("a");

//		System.out.println(
//				lista.stream().
//				filter(Objects::nonNull).
//				filter(elemento -> elemento.startsWith("a")).
//				findAny());
		
		Map<Integer, String> resultado = lista.stream().
				filter(Objects::nonNull).
				map(String::toUpperCase).
				collect(Collectors.toMap(s -> s.length),));
		
		// IMPLEMENTAR RESULTADO DENTRO DE OUTRA LISTA
		List<String> resultado = lista.stream().
				filter(Objects::nonNull).
				filter(elemento -> elemento.startsWith("a")).
				collect(Collectors.toList()));
		

		System.out.println("***************************************");
		System.out.println(lista);
		System.out.println(resultado);
	}

	private String converteString(String s) {
		System.out.println("ENTROU");
		return s.toUpperCase();
	}
}
