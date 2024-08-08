package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercicio5 {

	// r = c / (2 * Math.PI);

	public BigDecimal calculaRaio(double c) {
		return BigDecimal.valueOf(c).divide(BigDecimal.valueOf(2).multiply((BigDecimal.valueOf(Math.PI))), 4,
				RoundingMode.HALF_EVEN);
	}
}