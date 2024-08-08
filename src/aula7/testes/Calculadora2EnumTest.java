package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import aula6.outros.Calculadora2Enum;

class Calculadora2EnumTest {

		int a = 15;
		int b = 3;
		
		@Test
		void deveRetornar18() {
			assertEquals(18, Calculadora2Enum.SOMA.getCalculo().apply(a, b));
		}

		@Test
		void deveRetornar12() {
			assertEquals(12, Calculadora2Enum.SUBTRACAO.getCalculo().apply(a, b));
		}
		
		@Test
		void deveRetornar5() {
			assertEquals(5, Calculadora2Enum.DIVISAO.getCalculo().apply(a, b));
		}
		
		@Test
		void deveRetornar45() {
			assertEquals(45, Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(a, b));
		}
		
	}
