package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crie uma classe Pessoa, com os atributos "nome" e "dataNascimento". 
		 * Em seguida, crie outra classe chamada PessoaFisica, que deve herdar 
		 * as características de Pessoa e adicionar o atributo "cpf". 
		 * Na classe principal, crie 1 Pessoa e 1 PessoaFisica 
		 * e imprima os atributos da pessoa mais nova.
		 */

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setDataNascimento(LocalDate.of(1986, 1, 1));

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Vicente");
		pessoaFisica.setDataNascimento(LocalDate.of(1986, 1, 1));
		pessoaFisica.setCpf("123.456.789-10");

		JOptionPane.showMessageDialog(null, pessoaMaisNova(pessoa, pessoaFisica));
		;

	}

	// Método para mostrar dados de Pessoa
	public static String mostrarDados(Pessoa pessoa) {
		int idade = Period.between(pessoa.getDataNascimento(), LocalDate.now()).getYears();
		String dados = "Nome: " + pessoa.getNome() + "\nIdade: " + idade;
		//Verifica se tem algum atributo adicional como o CPF
		if (pessoa instanceof PessoaFisica) {
			PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
			dados += "\nCPF: " + pessoaFisica.getCpf();
		}
		return dados;
	}

	// Método para achar a pessoa mais nova
	public static String pessoaMaisNova(Pessoa pessoa1, Pessoa pessoa2) {
		if (pessoa1.getDataNascimento().isAfter(pessoa2.getDataNascimento())) {
			return mostrarDados(pessoa1);
		} else if (pessoa1.getDataNascimento().isBefore(pessoa2.getDataNascimento())) {
			return mostrarDados(pessoa2);
		}
		return "Ambos têm a mesma idade! \n\n" + mostrarDados(pessoa1) + "\n\n" + mostrarDados(pessoa2);
	}
}