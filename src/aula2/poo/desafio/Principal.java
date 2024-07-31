package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
	/*
	 * Crie uma classe chamada Carro, que vai conter 2 atributos: Modelo e Ano. Em
	 * seguida, no construtor da classe Principal, peça ao usuário para digitar
	 * modelo, e ano de carros. Ele deve continuar digitando até que que escreva
	 * “fim” no campo modelo. Nesse momento, o sistema deve exibir os carros em
	 * ordem decrescente de idade (ou seja, do mais velho ao mais novo).
	 */

	ArrayList<Carro> listaCarros = new ArrayList<>();

	String input = "";
	do {
		input = JOptionPane.showInputDialog(
				"Digite o modelo do carro: (ou digite 'fim')");
		if (!input.equalsIgnoreCase("fim")) {
			Carro carro = new Carro();
			carro.setModelo(input);
			input = JOptionPane.showInputDialog("Digite o ano do carro: (yyyy)");
			carro.setAno(Integer.parseInt(input));
			listaCarros.add(carro);
		}
	} while (!input.equals("fim"));

	listaCarros.sort(Comparator.comparing(Carro::getAno));
	String txt = "";
	for (Carro carro : listaCarros) {
		txt += mostrarDados(carro) + "\n\n";
	}
	
	JOptionPane.showMessageDialog(null, txt);
}
//Método para mostrar da lista de carros
public static String mostrarDados(Carro carro) {
	return "       Lista de Carro(s)\n\n" 
			+ "Modelo: " + carro.getModelo() + "\nAno: " + carro.getAno();
}
}
