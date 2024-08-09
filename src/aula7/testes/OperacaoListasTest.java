package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OperacaoListasTest {

	OperacaoListas operacaoLista = new OperacaoListas();
	List<Integer> lista = new ArrayList<>();
	List<Integer> lista1 = new ArrayList<>();
	@Test
	void deveRetornarSomaDeNumeros() {
		lista.add(60);
		lista.add(40);

		assertEquals(100, operacaoLista.somarNumeros(lista));
	}

	@Test
	void deveRetornarMediaDosNumerosMaioresQue50() {
		lista1.add(1);
		lista1.add(10);
		lista1.add(49);
		lista1.add(91);
		lista1.add(60);
		lista1.add(72);

		assertEquals(74.33, operacaoLista.mediaNumerosMaiores50(lista1));

	}

	@Test
	void deveRetornarQuantidadeDoNumero25() {
		lista.add(25);
		lista.add(25);
		lista.add(26);
		lista.add(24);

		assertEquals(2, operacaoLista.contarNumero25(lista));
		
	}
	
}