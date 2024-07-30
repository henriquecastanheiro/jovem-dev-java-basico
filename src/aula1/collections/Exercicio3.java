package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio3 {
	/*
	 * Faça um programa que crie uma lista com 50 números inteiros com valor máximo 20.
	 * Mostre a lista e, em seguida, mostre apenas os números contidos na lista, sem repetição. 
	 * Não utilize nenhuma estrutura de repetição para fazer essa tarefa. 
	 * 
	 * Exemplo: 
	 * Original: 1 2 3 4 3 5 2 6 2 6 
	 * Sem repetição: 1 2 3 4 5 6
	 */
	
	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		Set<Integer> listaSemRepeticao = new HashSet<Integer>();
		Random numAleatorio = new Random();
		String txt = "";

		for (int i = 0; i < 50; i++) {
			// 21, POIS O PRIMIERO NÚMERO É O 0
			int num = numAleatorio.nextInt(21);
			lista.add(num);
			// CONVERSÃO DO ARRAYLIST PARA O HASHSET
			listaSemRepeticao.add(num);
		}
		txt += "Original: " + lista + "\n";
		txt += "Sem repetição: " + listaSemRepeticao;
		JOptionPane.showMessageDialog(null, txt);
	}


}
