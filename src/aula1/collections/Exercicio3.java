package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

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
		Set<Integer> listaLimpa = new HashSet<Integer>();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		String txt = "";
		
		Random numAleatorio = new Random();
		for(int i = 0; i < 50; i++) {
			lista.add(numAleatorio.nextInt(20));
			listaLimpa.add(numAleatorio.nextInt(20));
		}
		txt += lista;
		JOptionPane.showMessageDialog(null, txt + ", " + "\n" + listaLimpa + ", \"");
	}


}
