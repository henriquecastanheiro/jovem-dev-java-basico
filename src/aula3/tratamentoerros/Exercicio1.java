package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça para o usuário digitar um número inteiro.
		 * Se ele digitar algo diferente disso, exiba a mensagem 
		 * "Você digitou um valor não reconhecido",
		 * até que ele digite um valor válido. 
		 * Em seguida, mostre esse valor.
		 */
		
		JOptionPane.showMessageDialog(null, verificaNumero());
		
	}
	public static String verificaNumero(){
		try {
		int	numero = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite um número inteiro: "));
			if (numero < 0) {
				return "Número Negativo: " + numero;
			}
		return "Número: " + numero;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido!");
			return verificaNumero();
		}
		}
}
