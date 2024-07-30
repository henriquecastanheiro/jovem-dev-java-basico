package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Desafio {
/*
 *  Faça um programa que peça ao usuário para digitar palavras e apertar enter. 
 *  Ele deve continuar digitando até digitar a palavra "fim".
 *  A seguir, crie um mapa cujas chaves são as letras a, e, i, o, u. 
 *  O valor desse mapa é uma lista das palavras que contém as letras correspondentes. 
 *  No final, o programa deve mostrar, para cada letra, a lista de palavras em ordem crescente.
 */
	
//	=========================================REFAZER============================================
	
public static void main(String[] args) {
	// Usei mapa para armazenar listas de palavras para cada letra
	Map<Character, List<String>> mapa = new HashMap<>();
	char[] letras = { 'a', 'e', 'i', 'o', 'u' };

	for (char letra : letras) {
		mapa.put(letra, new ArrayList<>());
	}

	String palavra;
	StringBuilder resultado = new StringBuilder();

	while (true) {
		palavra = JOptionPane.showInputDialog("Digite uma palavra (ou 'fim' para encerrar):");

		// Se a palavra for "fim" encerra
		if (palavra.equals("fim")) {
			break;
		}

		// Verifica se a palavra contém cada uma das letras 
		// Adiciona à lista de cada letra
		for (char letra : letras) {
			// Converte o caracter para uma string
			if (palavra.toLowerCase().contains(String.valueOf(letra))) { 
				mapa.get(letra).add(palavra);
			}
		}
	}
	// Ordena as listas de palavras para cada letra
	for (List<String> lista : mapa.values()) {
		Collections.sort(lista);
	}
	resultado.append("Resultados:\n");
	for (char letra : letras) {
		List<String> palavras = mapa.get(letra);
		resultado.append("Palavras com a letra '").append(letra).append("': ").append(palavras).append("\n");
	}
	JOptionPane.showMessageDialog(null, resultado.toString());
}
}
