package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;

public class Exercicio5 {
	/*
	 * Crie dois sets com 10 números aleatórios entre 1 e 30. 
	 * Mostre os dois conjuntos e, em seguida, mostre apenas 
	 * os elementos que estiverem presentes em ambos os conjuntos.
	 * 
	 * Exemplo:
	 * 
	 * Conjunto 1: 1, 2, 3, 4 
	 * Conjunto 2: 3, 4, 5, 6 
	 * Interseção: 3, 4
	 */
	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		Random numAleatorios = new Random();

		// Loop para chegar a 10 números aleatórios
		while (conjunto1.size() < 10) {
			// Desta forma gera números de 1 a 30, não contendo o 0
			int num1 = numAleatorios.nextInt(30) + 1; 
			conjunto1.add(num1);
		}

		// Segundo Loop para chegar a 10 números aleatórios
		while (conjunto2.size() < 10) {
			int num2 = numAleatorios.nextInt(30) + 1;
			conjunto2.add(num2);
		}

		// Calcula a interseção dos dois conjuntos
		Set<Integer> intersecao = new HashSet<>(conjunto1);
		intersecao.retainAll(conjunto2);

		// Converte os conjuntos e a interseção de Set para List
		// Pois com o Set, ordeno e com o List, mostro...
		List<Integer> listaConjunto1 = new ArrayList<>(conjunto1);
		List<Integer> listaConjunto2 = new ArrayList<>(conjunto2);
		List<Integer> listaIntersecao = new ArrayList<>(intersecao);

		// Ordena as listas para ficar do menor para maior
		Collections.sort(listaConjunto1);
		Collections.sort(listaConjunto2);
		Collections.sort(listaIntersecao);
		
		JOptionPane.showMessageDialog(null, "Conjunto 1: " + listaConjunto1 + 
				"\nConjunto 2: " + listaConjunto2 + "\nInterseção: " + listaIntersecao);
	}
}

