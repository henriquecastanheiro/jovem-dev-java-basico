package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	String telefone;
	LocalDate dataNascimento;

	Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public boolean nasceuEmAnoBissexto() {
		int ano = dataNascimento.getYear();
		return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	}
}
