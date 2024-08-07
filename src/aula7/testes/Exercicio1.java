package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Exercicio1 {
	
	@Test
	void deveDispararSeListaVazia() {
		List<Integer> lista = new ArrayList<>();
		
		assertEquals("", lista);
}
}
