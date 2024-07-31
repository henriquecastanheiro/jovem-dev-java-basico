package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
	/*
	 * Faça um programa que peça ao usuário para digitar uma data 
	 * (formato dd/MM/yyyy) e mostre o dia da semana em que essa data caiu. 
	 * Para os fins desse programa, o dia da semana pode ser em inglês.
	 */
	String data = JOptionPane.showInputDialog("Digite uma data: (dd/MM/yyyy)");

	LocalDate dataFormatada = LocalDate.parse(
			data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
	JOptionPane.showMessageDialog(null,
			dataFormatada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
			+ " -> " + dataFormatada.getDayOfWeek());

	}
}