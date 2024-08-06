package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {   //	r = c / (2 * Math.PI);
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da circuferência: "));
		BigDecimal r = BigDecimal.valueOf(c)
				.divide(BigDecimal.valueOf(2)
				.multiply((BigDecimal.valueOf(Math.PI)))
				, 4, RoundingMode.HALF_EVEN);
				
		System.out.println(r);
	}
}
