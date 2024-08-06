package aula5.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploStream {

	public static void main(String[] args) {
			                                 /* **************************
			                                  * 						 *
			                                  * OPERAÇÕES INTERMEDIARIAS *
			                                  * 						 *
			                                  * **************************/
		new ExemploStream();
	}

	public ExemploStream() {
		
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("c");
		lista.add("d");
		lista.add("e");
		lista.add("a");
		
//		.filter(Objects::nonNull)	Usado frequentemente para remover null
//		.filter(elemento -> elemento.startsWith(null));
		lista.stream().filter(elemento -> elemento.startsWith("a")).map(this::converteString).forEach(System.out::println);
		
//		lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).map(String::length).forEach(System.out::println);
//		lista.stream().map(letra -> letra.toUpperCase()).forEach(System.out::println);
//		lista.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
//		lista.stream().distinct().forEach(System.out::println);
//		lista.stream().sorted().forEach(System.out::println);
//		lista.stream().limit(5).forEach(System.out::println);
		
		System.out.println("***************************************");
		System.out.println(lista);
	}
	private String converteString(String s) {
		System.out.println("ENTROU");
		return s.toUpperCase();
	}
}
