package aula7.testes;

import java.time.LocalDate;

public class Pessoa {
	String nome;

	Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}
}
