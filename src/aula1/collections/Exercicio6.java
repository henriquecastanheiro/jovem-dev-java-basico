package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio6 {
	
    public static void main(String[] args) {
		
    	/*
		 * Faça um programa que leia o nome de 5 alunos. 
		 * Em seguida, leia 3 notas de cada um dos 5 alunos.
		 * Armazene esses dados em um mapa, cuja chave é o nome do aluno. 
		 * Quando o usuário terminar de digitar as notas, 
		 * exiba o nome do aluno, suas notas e a média.
		 */
    	
        Map<String, ArrayList<Double>> mapa = new HashMap<>();

        int qtddAlunos = 5;
        int qtddNotas = 3; 

        for (int i = 0; i < qtddAlunos; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: " + (i + 1));

            // Lista para armazenar as notas do aluno
            ArrayList<Double> notas = new ArrayList<>();
        
            for (int j = 0; j < qtddNotas; j++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog(
                		"Digite a " + (j + 1) + " nota de " + nome));
                notas.add(nota);
            }
            mapa.put(nome, notas);
        }

        String txt = "Resultado de Notas\n\n";
        for (String nome : mapa.keySet()) {
            txt += "\nNome: " + nome + "\nNotas: " + mapa.get(nome) 
            + "\nMédia: " + calculaMedia(mapa.get(nome)) + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, txt);
    }

    // Método para calcular a média
    public static double calculaMedia(ArrayList<Double> notas) {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
