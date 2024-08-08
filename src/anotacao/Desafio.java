package anotacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Desafio {
	/*
	 * Faça um programa que peça ao usuário para digitar palavras e apertar enter.
	 * Ele deve continuar digitando até digitar a palavra "fim". A seguir, crie um
	 * mapa cujas chaves são as letras a, e, i, o, u. O valor desse mapa é uma lista
	 * das palavras que contém as letras correspondentes. No final, o programa deve
	 * mostrar, para cada letra, a lista de palavras em ordem crescente.
	 */
	public static void main(String[] args) {

		StringBuilder resultado = new StringBuilder();
		List<String> listaPalavras = new ArrayList<>();
		String palavra = "";
		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra (ou digite 'fim' para sair): ");
			if (!palavra.equalsIgnoreCase("fim")) {
				listaPalavras.add(palavra);
			}
		} while (!palavra.equalsIgnoreCase("fim"));
		Map<String, List<String>> mapa = new TreeMap<>();
		mapa.put("a", new ArrayList<>());
		mapa.put("e", new ArrayList<>());
		mapa.put("i", new ArrayList<>());
		mapa.put("o", new ArrayList<>());
		mapa.put("u", new ArrayList<>());

		for (String palavraItem : listaPalavras) {
			for (String letra : mapa.keySet()) {
				if (palavraItem.contains(letra)) {
					mapa.get(letra).add(palavraItem);
				}
			}
		}
		for (Map.Entry<String, List<String>> entry : mapa.entrySet()) {
			String letra = entry.getKey();
			List<String> palavras = entry.getValue();
			Collections.sort(palavras);
			resultado.append("Letra ").append(letra).append(": ").append(palavras).append("\n");
		}
		JOptionPane.showMessageDialog(null, resultado.toString());
	}
}