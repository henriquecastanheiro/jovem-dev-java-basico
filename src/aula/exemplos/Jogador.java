package aula.exemplos;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Jogador {
	
	String nomeJogador;
	int numeroChuteira;
	LocalDate dataNascimento;
	
	void boasVindas() {
		JOptionPane.showMessageDialog(null, "Boas vindas " + nomeJogador);
	}
}
