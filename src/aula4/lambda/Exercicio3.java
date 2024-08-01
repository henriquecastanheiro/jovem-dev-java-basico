package aula4.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Exercicio3 {
	// Crie uma lista de 5 alunos
	// Remova da lista alunos que comecam com T e terminam com O.
	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		try {
			for (int i = 0; i < 5; i++) {
				String nome = JOptionPane.showInputDialog(
					"Digite o nome do " + (i + 1) + "º Aluno: ").toUpperCase();
				lista.add(nome);
			}

			Collections.sort(lista);
			System.out.println("Lista Original:");
			lista.forEach(s -> System.out.println(s));
			// Remove os nomes que começam com T e terminam com O.
			lista.removeIf(nome -> nome.startsWith("T") && nome.endsWith("O"));

			// Exibe a lista final
			System.out.println("\nLista Final:");
			lista.forEach(t -> System.out.println(t));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
