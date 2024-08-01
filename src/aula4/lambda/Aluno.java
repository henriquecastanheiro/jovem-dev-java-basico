package aula4.lambda;

import java.time.LocalDate;

public class Aluno{
	private String nome;
	private int numeroChamada;
	private LocalDate dataNascimento;
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroChamada=" + numeroChamada + ", dataNascimento=" + dataNascimento + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroChamada() {
		return numeroChamada;
	}
	public void setNumeroChamada(int numeroChamada) {
		this.numeroChamada = numeroChamada;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
