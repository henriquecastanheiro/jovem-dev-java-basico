package aula6.outros;

public class Exemplo {
	
	private int numero;
	
	public Exemplo(int numero) {
		this.numero = numero;
	}
	
	public String verificaNumero(int i) {
		if(i == 0) {
			
			return "ZERO";
		}
		throw new IllegalArgumentException("Deve ser zero");
	}
}
