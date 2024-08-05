package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Exercicio4 {
	/*
	 * Crie uma classe chamada Pessoa contendo nome, telefone e data de nascimento.
	 * A seguir, crie uma lista com 10 pessoas e mostre todas as pessoas que
	 * nascidas em maio, ordenadas por nome
	 * 
	 */
	public static void main(String[] args) {

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	List<Pessoa> lista = new ArrayList<>();

	for(int i = 0; i < 10; i++) {
		String nome = JOptionPane.showInputDialog(null, "Digite o nome da"+(i+1)+"pessoa: ");
		String telefone = JOptionPane.showInputDialog("Informe o número de telefone de " + nome + "  (DDD 12345-6789)");
		LocalDate dataNascimento = null;
		while (dataNascimento == null) {
			String strDataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento de " + nome + ": ");
			try {
				dataNascimento = LocalDate.parse(strDataNascimento, format);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data de Nascimento inválida, Por favor tente novamente.");
			}
		}
		
		Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento);
		lista.add(pessoa);
	}
	
		lista.stream()
			.filter(pessoa -> pessoa.dataNascimento.getMonth() == Month.MAY)
			.sorted((pessoa1, pessoa2) -> pessoa1.nome.compareTo(pessoa2.nome))
            .collect(Collectors.toList())
            .forEach(pessoa -> System.out.println(
            "Nome: " + pessoa.nome + ", Telefone: " + pessoa.telefone + ", Data de Nascimento: " + pessoa.dataNascimento));
	}

}
