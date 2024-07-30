package aula1.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio4 {
	/*
	 * Faça um programa que peça para o usuário digitar uma frase. 
	 * Em seguida, mostre a quantidade de vezes que cada caractere aparece na frase. 
	 * Utilize a coleção HashMap para esta tarefa.
	 * 
	 * Exemplo: 
	 * Frase: java basico 
	 * Resultado: j - 1, a - 3, v - 1, b - 1, s - 1, c -1, o - 1, - 1
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();

		// Armazeno a contagem dos caracter com LinkedHashMap para garantir a ordem de inserção
		Map<Character, Integer> contCaracter = new LinkedHashMap<>();

		for (int i = 0; i < frase.length(); i++) {
			// Com charAt posso percorrer cada caracter da frase
			char caracter = frase.charAt(i);
			// Se o caracter já está na contagem adiciona +1
			if (contCaracter.containsKey(caracter)) {
				contCaracter.put(caracter, contCaracter.get(caracter) + 1);
				
			} else {
				// Se não adiciona o caracter com contagem inicial 1
				contCaracter.put(caracter, 1);
			}
		}
		JOptionPane.showMessageDialog(null, "Frase: " + frase + "\n\n" + "Resultado: " + contCaracter);
	}
}
