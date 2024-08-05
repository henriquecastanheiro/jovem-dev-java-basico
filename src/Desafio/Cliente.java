package Desafio;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	String nome;
	LocalDate dataNascimento;

	// Construtor para inicializar os campos nome e data de nascimento
	public Cliente(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;

	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	// Diferença entre a data de nascimento do cliente e a data atual.
	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	public boolean diaAniversario() {
		LocalDate hoje = LocalDate.now();
		return hoje.getDayOfMonth() == dataNascimento.getDayOfMonth() && hoje.getMonth() == dataNascimento.getMonth();
	}
	 // Método que retorna se o cliente é premium (por padrão, não é)
    public boolean isPremium() {
        return false;
    }
    public String getNomeMascarado() {
        return nome.charAt(0) + "*".repeat(nome.length() - 1);
    }
}
