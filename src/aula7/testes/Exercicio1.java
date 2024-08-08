package aula7.testes;

import java.util.List;


import java.util.stream.Collectors;

import aula5.stream.Pessoa;

public class Exercicio1 {
	/*
	 * Utilize a classe Pessoa do exercício 4. Em seguida, crie uma lista com 10
	 * pessoas (não é necessário preencher o telefone). Mostre apenas os nomes que
	 * começam com vogal ou nasceram em ano bissexto, em ordem alfabética
	 * decrescente e separados por ponto e vírgula.
	 */
	public static void main(String[] args) {
		
	}
	
	public List<String> convertePessoaParaString(List<Pessoa> lista) {
		return lista.stream()
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
	}

}