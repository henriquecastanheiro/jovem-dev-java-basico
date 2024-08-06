package aula5.stream;


import java.util.Random;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Exercicio1 {

	public static void main(String[] args) {

	
		/*
		 * Faça um programa que cria uma lista com 50 
		 * números aleatórios de 1 a 100 e
		 * imprime a soma de todos os números
		 */
	Random random = new Random();
	int streamSize = 50;
	int numeroInicial = 1;
	int numeroFinal = 100;
	IntStream ds = random.ints(streamSize, numeroInicial, numeroFinal);
	ds.forEach(s -> System.out.print(s + ", "));
		/*
		 * Faça um programa que cria uma lista com 
		 * 50 números aleatórios de 1 a 100 e
		 * imprime a soma de todos os números
		 */
		List<Integer> lista = new ArrayList<>();
		Random numAleatorios = new Random();
		for (int i = 0; i < 50; i++) {
			int num = numAleatorios.nextInt(100) + 1;
			lista.add(num);
		}
		// Objetivo: Soma total dos números
		int soma = lista.stream().mapToInt(Integer::intValue).sum();
		lista.stream().sorted().forEach(s -> System.out.print(s + ", "));
		System.out.println("\nA soma de todos os números é: " + soma);
		// Extra: Soma dos números sem repeticão
		int somaSemRepeticao = lista.stream().distinct().mapToInt(Integer::intValue).sum();
		lista.stream().distinct().sorted().forEach(s -> System.out.print(s + ", "));
		System.out.println("\nA soma dos números sem repetição é: " + somaSemRepeticao);
	}
}
