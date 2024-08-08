package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import aula6.outros.Exercicio5;

class Aula6Exercicio5Test {

	/*
	 * Cria uma classe de teste para testar o Exercício 5 da aula de BigDecimal
	 * (cálculo do raio). Utilize valores conhecidos para realizar o teste ou
	 * confirme se os dados estão corretos utilizando alguma ferramenta online para
	 * o cálculo do raio.
	 */

		Exercicio5 ex = new Exercicio5();
		
		@Test
		void deveRetornarRaio0796Metros() {
			assertEquals(BigDecimal.valueOf(1.5915), ex.calculaRaio(10));
		}
		
		@Test
		void deveRetornarRaio0477Metros() {
			assertEquals(BigDecimal.valueOf(0.7958), ex.calculaRaio(5));
		}
		
		@Test
		void deveRetornarRaio0318Metros() {
			assertEquals(BigDecimal.valueOf(0.1592), ex.calculaRaio(1));
		}

	}

