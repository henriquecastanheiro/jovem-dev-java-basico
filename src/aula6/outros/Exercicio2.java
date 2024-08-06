package aula6.outros;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		for(Calculadora1Enum operacao : Calculadora1Enum.values()) {
			if(operacao.equals(operacao.SOMA)) {
				int resultado = operacao.calcula(a, b);
                System.out.println("Operação: " + operacao.getNomeAmigavel() + 
                                   ", Resultado: " + resultado);
			}if(operacao.equals(operacao.SUBTRACAO)) {
				int resultado = operacao.calcula(a, b);
                System.out.println("Operação: " + operacao.getNomeAmigavel() + 
                                   ", Resultado: " + resultado);
			}if(operacao.equals(operacao.DIVISAO)) {
				int resultado = operacao.calcula(a, b);
                System.out.println("Operação: " + operacao.getNomeAmigavel() + 
                                   ", Resultado: " + resultado);
			}if(operacao.equals(operacao.MULTIPLICACAO)) {
				int resultado = operacao.calcula(a, b);
                System.out.println("Operação: " + operacao.getNomeAmigavel() + 
                                   ", Resultado: " + resultado);
			}
		}
	}
}
