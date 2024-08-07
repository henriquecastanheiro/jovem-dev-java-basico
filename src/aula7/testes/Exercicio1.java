package aula7.testes;

import java.util.List;
import java.util.stream.Collectors;

import aula5.stream.Pessoa;

public class Desafio {
	/*
	 * Utilize a classe Pessoa do exercício 4. Em seguida, crie uma lista com 10
	 * pessoas (não é necessário preencher o telefone). Mostre apenas os nomes que
	 * começam com vogal ou nasceram em ano bissexto, em ordem alfabética
	 * decrescente e separados por ponto e vírgula.
	 */
	public static void main(String[] args) {
		
	}
	
	public String dadosPessoa(List<Pessoa> lista) {
		return lista.stream()
                .filter(p -> comecaComVogal(p.getNome()))
                .map(Pessoa::getNome)
                .sorted((a, b) -> b.compareToIgnoreCase(a))
                .collect(Collectors.joining("; "));
	}
	
	private static boolean comecaComVogal(String nome) {
		char primeiraLetra = Character.toLowerCase(nome.charAt(0));
		return primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o'
				|| primeiraLetra == 'u';
	}

}