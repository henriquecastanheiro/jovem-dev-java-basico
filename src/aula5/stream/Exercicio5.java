package aula5.stream;

import java.util.List;
import java.util.Optional;

import javax.swing.JOptionPane;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	/*
	 * Faça um programa que cria uma lista com 10 nomes. Em seguida, imprima o nome
	 * da primeira pessoa da lista que possua o nome terminado com "berto". Se não
	 * houver, dispare uma ZeroBertoException.
	 * 
	 */
	public static void main(String[] args) {
	
	}
		public String encontreBerto(List<String>lista) {
	        try {
	            Optional<String> resultado = lista.stream()
	                    .filter(nome -> nome.toLowerCase().endsWith("berto"))
	                    .findFirst();
	            if (resultado.isPresent()) {
	              JOptionPane.showMessageDialog(null, "Primeiro nome encontrado: " + resultado.get());
	            } else {
	                throw new ZeroBertoException("");
	            }
	        } catch (ZeroBertoException e) {
	        	e.printStackTrace();
	        }
			return null;
	    }
	}