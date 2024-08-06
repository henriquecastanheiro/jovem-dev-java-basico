package aula6.outros;

public class Exercicio3 {

	public static void main(String[] args) {

		StringBuilder resultado = new StringBuilder();
		resultado.append("Valores: 10 e 5\n\n");
		
		int a = 10;
		int b = 5;
		
		for (Calculadora2Enum operacao : Calculadora2Enum.values()) {
			resultado.append(operacao.getNomeAmigavel())
			.append(operacao.getCalculo().apply(a, b))
			//				 SOMA.calculo.apply(10, 5);
			.append("\n");
		}
		System.out.println(resultado);
	}
}