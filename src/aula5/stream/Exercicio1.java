package aula5.stream;

import java.util.Random;
import java.util.stream.IntStream;

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
	}
}
