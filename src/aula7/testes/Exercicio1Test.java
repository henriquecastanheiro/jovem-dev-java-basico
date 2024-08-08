package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aula5.stream.Pessoa;


public class Exercicio1Test {
		List<Pessoa> listaPessoa = new ArrayList<>();
		List<String> lista = new ArrayList<>();
	
		Exercicio1 ex = new Exercicio1();
		List<String> vazio = new ArrayList<>();
		
	@Test
	void deveRetonarHenriqueGabriel() {
		//ListaPessoa
		listaPessoa.add(new Pessoa("Henrique", LocalDate.of(2003, 2, 14)));
		listaPessoa.add(new Pessoa("Gabriel", LocalDate.of(2002, 6, 11)));
		
		List<String> vazio = ex.convertePessoaParaString(listaPessoa);
		
		//Lista
		lista.add("Henrique");
		lista.add("Gabriel");
		
		assertEquals(lista, vazio);
}
	@Test
	void deveRetornarNada() {
			assertEquals(lista, listaPessoa);
}
}
