package aula2.poo.exercicio5;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	/*
	 * Crie uma classe chamada Pessoa, que conterá 2 atributos: 
	 * Nome e Data de Nascimento, que deve ser LocalDate. 
	 * Em seguida, no construtor da classe principal, 
	 * crie 2 pessoas com atributos diferentes. 
	 * A seguir, crie um método que imprima o nome e a idade da pessoa mais velha.
	 * 
	 */
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Henrique Castanheiro");
		pessoa1.setDataNascimento(LocalDate.of(2001,12,25));
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Leticia Gomes");
		pessoa2.setDataNascimento(LocalDate.of(2000,12,25));
	
		Pessoa pessoaMaisVelha = maisVelha(pessoa1, pessoa2);
		//Se as datas não forem iguais
		if(pessoaMaisVelha != null) {
			JOptionPane.showMessageDialog(null, "       Pessoa Mais Velha \n" 
					+ "\nNome: " + pessoaMaisVelha.getNome() 
					+ "\nIdade: " + pessoaMaisVelha.getIdade() + " anos");
		}
		
	}
	public static Pessoa maisVelha(Pessoa p1, Pessoa p2) {
		// Compara as duas datas e retorna a mais velha
		if( p1.getDataNascimento().isBefore(p2.getDataNascimento())){
			return p1;
		}else 
			//Analisando se as datas são iguais
			if(p1.getDataNascimento().equals(p2.getDataNascimento())) {
			JOptionPane.showMessageDialog(null,  "As duas pessoas tem a mesma idade.");
			return null;
		}else {
			return p2;
	}
		}
}
