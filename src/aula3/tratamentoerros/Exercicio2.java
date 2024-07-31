package aula3.tratamentoerros;

import javax.swing.JOptionPane;
import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {
	/*
	 * Crie uma função que receba dois números inteiros 
	 * e divida o primeiro pelo segundo. 
	 * Caso o segundo seja zero, dispare uma exceção chamada 
	 * ZeroException com a mensagem “O segundo número não pode ser zero”.
	 * Capture essa exceção e mostre seu conteúdo ao usuário.
	 */
		dividirDoisNumeros();
	}
	public static String dividirDoisNumeros() {
		try {
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1ª Número: "));
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2ª Número: "));
			int resultado = numero2/numero1;
			return "A divisão de "+ numero1 +"/"+numero2 ": \n" +;
		} catch (ZeroException e)  {
			JOptionPane.showMessageDialog(null, "O segundo número não pode ser zero!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Os inputs não podem estar vazios!");
		}
		return dividirDoisNumeros();
	}
}
