package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafio {
	/*
	 * Utilize a classe Pessoa do exercício 4. Em seguida, crie uma lista com 10
	 * pessoas (não é necessário preencher o telefone). Mostre apenas os nomes que
	 * começam com vogal ou nasceram em ano bissexto, em ordem alfabética
	 * decrescente e separados por ponto e vírgula.
	 */
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Pessoa> lista = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da " + (i + 1) + ": ");
			String telefone = null;
			LocalDate dataNascimento = null;
			while (dataNascimento == null) {
				String stringDataNascimento = JOptionPane
						.showInputDialog("Informe a data de nascimento de " + nome + ": ");
				try {
					dataNascimento = LocalDate.parse(stringDataNascimento, format);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, 
							"Data de Nascimento inválida, Por favor tente novamente.");
				}

			} Pessoa pessoa = new Pessoa(nome, telefone , dataNascimento);
			lista.add(pessoa);
		}
		List<String> nomesFiltrados = new ArrayList<>();
		String resultado = lista.stream()
                .filter(p -> comecaComVogal(p.getNome()) || p.nasceuEmAnoBissexto())
                .map(Pessoa::getNome)
                .sorted((a, b) -> b.compareToIgnoreCase(a))
                .collect(Collectors.joining("; "));
		
		nomesFiltrados.add(resultado);
        JOptionPane.showMessageDialog(null, nomesFiltrados);
	}

// Método para verificar se o nome começa com uma vogal
	private static boolean comecaComVogal(String nome) {
		char primeiraLetra = Character.toLowerCase(nome.charAt(0));
		return primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o'
				|| primeiraLetra == 'u';
	}
}