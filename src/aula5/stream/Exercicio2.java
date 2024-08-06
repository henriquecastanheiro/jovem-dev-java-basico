package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que cria uma lista com 50 números aleatórios de 1 a 100 e
		 * mostre a média de todos os números maiores que 50
		 */
		List<Integer> lista = new ArrayList<>();
		Random numerosAleatorios = new Random();
		for (int i = 1; i < 100; i++) {
			int num = numerosAleatorios.nextInt(100);
			lista.add(num); 
		}
		double media = lista.stream().filter(num -> num > 50).mapToInt(i -> i.intValue()).average().orElse(0);
		System.out.println(media);
	}
}