package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import aula7.testes.exceptions.ZeroBertoException;

class Exercicio2Test {
	
			Exercicio2 ex = new Exercicio2();
			List<String> lista = new ArrayList<>();

			@Test

			void deveRetornarHumberto() {
//			● Lista com um berto: Esse elemento 

				lista.add("Henrique");
				lista.add("Gabriel");
				lista.add("Humberto");

				assertEquals(ex.encontreBerto(lista), "Humberto");
			}

			@Test
			void deveRetornarAlberto() {
//		 	● Lista com dois bertos: O primeiro berto
				lista.add("Alberto");
				lista.add("Saraiva");
				lista.add("Dagoberto");
				lista.add("Mario");
				lista.add("Miguel");

				assertEquals(ex.encontreBerto(lista), "Alberto");

			}
			
			@Test
			void deveDispararZeroBertoException() {
//			● Lista vazia, lista sem bertos: Exception 
				assertThrows(ZeroBertoException.class, () -> ex.encontreBerto(lista));
				
				lista.add("Vinicius");
				lista.add("Thiago");
				lista.add("Mauricio");
				lista.add("Elierto");
				
				assertThrows(ZeroBertoException.class, () -> ex.encontreBerto(lista));
			}
		}
