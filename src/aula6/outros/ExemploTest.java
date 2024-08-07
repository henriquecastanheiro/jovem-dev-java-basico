package aula6.outros;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExemploTest {
	
	private Exemplo exemplo = new Exemplo(25);
	
	@BeforeEach
	void setup() {
		exemplo = new Exemplo(50);
	}
	
	@Test
	@DisplayName("Caso seja 0, deve retornar ZERO; Exceção caso contrário")
	void deveRetornarStringZeroQuandoNumeroIgualZero() {
		int i = 0;
		
		exemplo = new Exemplo(50);
		String s = exemplo.verificaNumero(i);
		
		assertEquals("ZERO", s);
	}
	
	@Test
	void deveRetornarStringZeroQuandoNumeroDiferenteZero() {
		int i = 2;
		
		assertThrows( IllegalArgumentException.class,() -> exemplo.verificaNumero(i));
		
	}

}
