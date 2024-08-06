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
<<<<<<< HEAD
		Random numerosAleatorios = new Random();
		for (int i = 1; i < 100; i++) {
			int num = numerosAleatorios.nextInt(100);
			lista.add(num); 
		}
		double media = lista.stream().filter(num -> num > 50).mapToInt(i -> i.intValue()).average().orElse(0);
		System.out.println(media);
	}
}
=======
		Random numAleatorios = new Random();
		for (int i = 0; i < 50; i++) {
			int num = numAleatorios.nextInt(100) + 1;
			lista.add(num);
		}
		lista.forEach(s -> System.out.print(s + ", "));
		// Calcular a média dos números maiores que 50
		double media = lista.stream().filter(n -> n > 50).mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("\nA média dos números maiores que 50 é: " + media);
	}
}
>>>>>>> c292632a5356809930a79285b0a10599afd1a6e7
