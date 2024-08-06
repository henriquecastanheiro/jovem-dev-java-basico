package aula6.exemplos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {
	
	public static void main(String[] args) {
			
		/***************
		 *             * 
		 * BIG DECIMAL *
		 *             *
		 ***************/
		
//		System.out.println(Math.pow(100,200));
//		System.out.println(BigDecimal.valueOf(100).pow(200));
//		b.add(BigDecimal.valueOf(100)); NÃO FAZER ISSO
//		ATRIBUIR A UMA VARIAVÉL
//		b = b.add(BigDecimal.valueOf(100));
		BigDecimal b = BigDecimal.valueOf(50);
		BigDecimal b2 = BigDecimal.valueOf(2);
		b = b.divide(BigDecimal.valueOf(2));
		
		
		System.out.println(b.divide(b2, 5, RoundingMode.HALF_EVEN));
		new Principal();
	}
	public Principal() {
			
		/***************
		 *             * 
		 *    ENUM     *
		 *             *
		 ***************/
		
//	FormaPagamentoEnum f = FormaPagamentoEnum.DINHERIO;
//
//	if(FormaPagamentoEnum.DINHERIO.equals(f)) {
//		System.out.println("Fazendo operação com enum dinheiro!\nNão tem desconto!");
//		System.out.println(f.getDesconto());
//	switch(f) {
//	case CARTÃO_CREDITO:
//		break;
//	case CARTÃO_DEBITO:
//		break;
//		default;
//		break;
	}
//	if(FormaPagamentoEnum.CARTÃO_CRÉDITO == f) {
//		System.out.println("Fazendo outra operação com enum Cartão Crédito.\nNão tem desconto!");
//		System.out.println(f.getDesconto());
		
								

}

