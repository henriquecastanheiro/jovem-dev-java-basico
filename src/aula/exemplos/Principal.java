package aula.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Jogador jogador = new Jogador();
		jogador.nomeJogador = JOptionPane.showInputDialog("Digite o nome do jogador: ");
		jogador.numeroChuteira = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da chuteira: "));
		try {
			String dataNascimento = JOptionPane.showInputDialog("Digite data de nascimento de " + jogador.nomeJogador + " (dd/MM/yyyy) ");
			jogador.dataNascimento = LocalDate.parse(dataNascimento, format);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro 05: Entre em contato com henrique_castanheirotb@gmail.com" );
	}
		jogador.boasVindas();
}
}
