package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {
	/*
	 * Faça um programa que cria uma lista 
	 * com 50 números aleatórios de 1 a 100 e
	 * retorne quantos números "25" há na lista.
	 */
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		Random numAleatorios = new Random();
		for (int i = 0; i < 50; i++) {
			int num = numAleatorios.nextInt(100) + 1;
			lista.add(num);
		}
		lista.forEach(s -> System.out.print(s + ", "));

		long qtddDe25 = lista.stream().filter(n -> n == 25).count();
		System.out.println("\nQuantidade de números 25: " + qtddDe25);
	}
}
