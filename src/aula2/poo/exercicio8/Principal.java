package aula2.poo.exercicio8;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crie uma classe abstrata chamada Veiculo, que conterá os atributos 
		 * nome, cor e velocidade, além do método abstrato acelerar. 
		 * Depois crie uma classe filha chamada Automovel 
		 * que herda de Veiculo e sobrescreve acelerar, 
		 * imprimindo na tela a palavra "Vrum". 
		 * Crie uma classe principal para testar a criação de um automovel.
		 */
		Automovel carro = new Automovel();
		carro.acelerar();
	}
}