package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	  public int getIdade() {
		  //Utilizado o API Period
		  //Cálculo é feito com base na diferença entre a data de nascimento da pessoa e a data atual.
	        return Period.between(dataNascimento, LocalDate.now()).getYears();
	    }
}
