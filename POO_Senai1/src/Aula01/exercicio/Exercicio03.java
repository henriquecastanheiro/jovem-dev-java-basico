package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
	Retangulo retangulo = new Retangulo();
	
	retangulo.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retângulo: "));
	retangulo.largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do retângulo: "));
	
	retangulo.calculaArea(retangulo.altura, retangulo.largura);
	retangulo.calculaPerimetro(retangulo.altura, retangulo.largura);
}
}
