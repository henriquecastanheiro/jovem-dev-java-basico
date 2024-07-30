package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça ao usuário que digite duas frases 
		 * e depois diga a ele se as frases digitadas são iguais. 
		 * Informe ainda a quantidade de caracteres de cada frase.
		 */
		
		String frase1 = JOptionPane.showInputDialog("Digite a 1ª Frase: ");
		String frase2 = JOptionPane.showInputDialog("Digite a 1ª Frase: ");

		if(frase1.equalsIgnoreCase(frase2)) {
			JOptionPane.showMessageDialog(null,
					"As frases são iguais:\n\n" 
			+ "1ª Frase: "+ frase1 +"\nCaracter(s): "+ frase1.length() 
			+ "\n2ª Frase: " + frase2 +"\nCaracter(s): "+ frase2.length());
			
		} else {
			JOptionPane.showMessageDialog(null, 
					"As frases são diferentes:\n\n" 
			+ "1ª Frase: "+ frase1 +"\nCaracter(s): "+ frase1.length() 
			+ "\n2ª Frase: " + frase2 +"\nCaracter(s): "+ frase2.length());
		}
		
	}
}
