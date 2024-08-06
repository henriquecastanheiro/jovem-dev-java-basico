package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		StringBuilder txt = new StringBuilder();
		List<Pessoa> lista = new ArrayList<>();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < 2; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome: ");
			String telefone = JOptionPane.showInputDialog("Digite o telefone de " + (nome) + " : (DDD 12345-4567)");
			LocalDate dataNascimento = null;
			while (dataNascimento == null) {
				String strDataNascimento = JOptionPane
						.showInputDialog("Informe a data de nascimento de " + (nome) + " : (dd/MM/yyyy)");
				try {
					dataNascimento = LocalDate.parse(strDataNascimento, format);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro: 05 \nContate: henrique.castanheirotb@gmail.com");
				}
			}
			Pessoa pessoa = new Pessoa(nome, telefone, dataNascimento);
			lista.add(pessoa);
		}
		Pessoa pessoaMaisVelha = lista.stream()
				.min((pessoa1, pessoa2) -> pessoa1.getDataNascimento().compareTo(pessoa2.getDataNascimento()))
				.orElse(null);
		txt.append("DADOS DA PESSOA MAIS VELHA: \n\nNOME: ").append(pessoaMaisVelha.getNome()).append("\nTELEFONE: ")
				.append(pessoaMaisVelha.getTelefone()).append("\nDATA DE NASCIMENTO: ")
				.append(pessoaMaisVelha.getDataNascimento());
		JOptionPane.showMessageDialog(null, txt);
	}
}
