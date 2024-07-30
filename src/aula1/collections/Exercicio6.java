package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {
	/*
	 * Faça um programa que leia o nome de 5 alunos. 
	 * Em seguida, leia 3 notas de cada um dos 5 alunos. 
	 * Armazene esses dados em um mapa, cuja chave é o nome do aluno. 
	 * Quando o usuário terminar de digitar as notas, 
	 * exiba o nome do aluno, suas notas e a média.
	 */
	
	public static void main(String[] args) {
		Map<String, List<Double>> alunosNotas = new HashMap<>();

		//Loop para ler o nome dos 5 alunos
		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog
					("Digite o nome do aluno " + (i + 1) + ":");

			// Criando uma lista para armazenar as 3 notas
			List<Double> notas = new ArrayList<>();
			// Loop para ler as 3 notas
			for (int j = 0; j < 3; j++) {
				String notaStr = JOptionPane.showInputDialog
						("Digite a nota " + (j + 1) + " do aluno " + nome + ":");
				double nota = Double.parseDouble(notaStr);
				notas.add(nota);
			}
			// Armazenar os dados no mapa
			alunosNotas.put(nome, notas);
		}

		StringBuilder resultado = new StringBuilder("Notas dos Alunos:\n");

		for (Map.Entry<String, List<Double>> entry : alunosNotas.entrySet()) {
			String nome = entry.getKey();
			List<Double> notas = entry.getValue();

			// Calcular a média
			double soma = 0;
			for (double nota : notas) {
				soma += nota;
			}
			double media = soma / notas.size();

			resultado.append("Aluno: ").append(nome).append("\n");
			resultado.append("Notas: ");
			for (double nota : notas) {
				resultado.append(nota).append(", ");
			}
			resultado.append("\nMédia: ").append(String.format("%.2f", media)).append("\n\n");
		}
		JOptionPane.showMessageDialog(null, resultado.toString());
	}
}
