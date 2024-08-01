package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {
	/*
	 * Crie uma classe chamada Aluno, com numeroChamada, nome e dataNascimento. 
	 * Em seguida, na classe Principal, crie uma lista com 5 alunos e, 
	 * em seguida, utilize Comparator.comparing para ordenar os alunos 
	 * por data de nascimento. Mostre a lista ordenada.
	 */
	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<>();

		try {

			Aluno aluno1 = new Aluno();
			aluno1.setNome("Henrique");
			aluno1.setNumeroChamada(0);
			aluno1.setDataNascimento(LocalDate.of(2000, 1, 1));
			lista.add(aluno1);

			Aluno aluno2 = new Aluno();
			aluno2.setNome("Henrique");
			aluno2.setNumeroChamada(0);
			aluno2.setDataNascimento(LocalDate.of(2000, 2, 2));
			lista.add(aluno2);

			Aluno aluno3 = new Aluno();
			aluno3.setNome("Henrique");
			aluno3.setNumeroChamada(0);
			aluno3.setDataNascimento(LocalDate.of(1998, 5, 2));
			lista.add(aluno3);

			Aluno aluno4 = new Aluno();
			aluno4.setNome("Henrique");
			aluno4.setNumeroChamada(0);
			aluno4.setDataNascimento(LocalDate.of(2003, 1, 1));
			lista.add(aluno4);

			Aluno aluno5 = new Aluno();
			aluno5.setNome("Henrique");
			aluno5.setNumeroChamada(0);
			aluno5.setDataNascimento(LocalDate.of(2018, 1, 19));
			lista.add(aluno5);

			lista.sort(Comparator.comparing(Aluno::getDataNascimento));
			lista.forEach(s -> System.out.println(s));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro 05: Entre em contato com henrique_castanheirotb@gmail.com");
		}
	}
}
