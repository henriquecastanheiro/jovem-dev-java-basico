package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio1 {
	/*
	 * Faça um programa que crie uma lista com 50 números inteiros aleatórios e
	 * depois exiba-os ordenados do menor para o maior
	 */

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random numAleatorios = new Random();

		String txt = "";
		for (int i = 0; i < 50; i++) {
			lista.add(numAleatorios.nextInt(100));
		}
		//MENOR PARA MAIOR USANDO SORT
		Collections.sort(lista);
		txt += lista;
		JOptionPane.showMessageDialog(null, txt + ", ");
	}
}
