package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Desafio {

    public static void main(String[] args) {
        /*
         * Faça um programa que peça ao usuário para digitar palavras e apertar enter. 
         * Ele deve continuar digitando até digitar a palavra "fim".
         * A seguir, crie um mapa cujas chaves são as letras a, e, i, o, u. 
         * O valor desse mapa é uma lista das palavras que contém as letras correspondentes. 
         * No final, o programa deve mostrar, para cada letra, a lista de palavras em ordem crescente.
         */

		ArrayList<String> listaPalavras = new ArrayList<>();
		String palavra = "";

		// Só termina quando o usuário digitar "fim"
		do {
			palavra = JOptionPane.showInputDialog(
					"Digite uma palavra ('fim' para encerrar)").toLowerCase();
			if (!palavra.equals("fim")) {
				listaPalavras.add(palavra);
			}
		} while (!palavra.equals("fim"));

		// Mapa com listas vazias para cada vogal
		Map<String, ArrayList<String>> mapa = new HashMap<>();
		mapa.put("a", new ArrayList<>());
		mapa.put("e", new ArrayList<>());
		mapa.put("i", new ArrayList<>());
		mapa.put("o", new ArrayList<>());
		mapa.put("u", new ArrayList<>());

		// Adiciona palavras as listas do mapa
		for (String palavras : listaPalavras) {
			for (String chave : mapa.keySet()) {
				if (palavras.contains(chave)) {
					mapa.get(chave).add(palavras);
				}
			}
		}

		String txt = "Resultado das Palavras:\n\n";
		for (String chave : mapa.keySet()) {
			ArrayList<String> listaPalavrasLetras = mapa.get(chave);
			Collections.sort(listaPalavrasLetras);
			txt += "Palavras com a letra '" + chave + "': " + listaPalavrasLetras + "\n";
		}

		JOptionPane.showMessageDialog(null, txt);
	}
}
