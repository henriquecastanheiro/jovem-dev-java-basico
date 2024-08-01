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
		JOptionPane.showMessageDialog(null, dividirDoisNumeros());
	}
	
	public static String dividirDoisNumeros() {
		try {
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1ª Número: "));
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2ª Número: "));
			if (numero2 == 0) {
				//A mensagem vem da classe ZeroException
				throw new ZeroException(null);
			}
			int resultado = numero1 / numero2;
			return "Divisão de " + numero1 + " / " + numero2 + " \nResultado: " + resultado;
		// Dispara a exceção ZeroException e exibe a mensagem
		} catch (ZeroException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return dividirDoisNumeros();
		// Dispara a exceção NumberFormatException, caso os números forem inválidos
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Os inputs devem ser números válidos!");
			return dividirDoisNumeros();
		//Dispara a excecão Exception, caso houver um erro desconhecido
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro 05: Entre em contato com henrique_castanheirotb@gmail.com");
			return dividirDoisNumeros();
		}
	}
}