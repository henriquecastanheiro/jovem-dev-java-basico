package aula6.outros;

public class Exercicio2 {

	public static void main(String[] args) {

		StringBuilder resultado = new StringBuilder();
		resultado.append("Valores: 10 e 10\n\n");
		
		int a = 10;
		int b = 10;
		for (Calculadora1Enum operacao : Calculadora1Enum.values()) {
			resultado.append(operacao).append(" : ")
			.append(operacao.getCalcula().calcula(a, b))
			.append("\n");
		}
		System.out.println(resultado);
	}
}
