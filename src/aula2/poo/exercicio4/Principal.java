package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		/*
		 * Crie uma classe chamada Carro, que vai conter 3 atributos: 
		 * Modelo, Ano e Cor.
		 * Em seguida, no construtor da classe Principal, 
		 * crie 3 carros com atributos diferentes e
		 * imprima modelo, ano e cor de cada um deles. *
		 * ***********************************************************
		 */
	
		Carro fusca = new Carro();
		fusca.setAno(1976);
		fusca.setModelo("VW 1300");
		fusca.setCor("Branco");
		
		Carro civic = new Carro();
		civic.setAno(2022);
		civic.setModelo("Sport");
		civic.setCor("Preto");
		
		Carro uno = new Carro();
		uno.setAno(2014);
		uno.setModelo("Vivace");
		uno.setCor("Branco");
		
		String txt = imprimeDetalhes(fusca) 
			+ "\n\n" + imprimeDetalhes(civic) 
				+ "\n\n" + imprimeDetalhes(uno);
		JOptionPane.showMessageDialog(null, txt);
		
	}
	
		public static String imprimeDetalhes(Carro carro) {
			return "Modelo: " + carro.getModelo()
					+"\nAno: " + carro.getAno()
					+"\nCor: " + carro.getCor();
		}
	}

