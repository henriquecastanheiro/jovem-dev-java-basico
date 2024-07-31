package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crie uma classe chamada NotaFiscal, que conterá 
		 * os atributos "emitente" e "valor". 
		 * Crie um método de objeto chamado "calculaValor" 
		 * que receberá o preço bruto do produto e o valor 
		 * do desconto e armazenará o cálculo no atributo valor. 
		 * Por motivos de segurança, o atributo valor não pode ser modificado
		 * fora dessa função. 
		 * Na classe principal, crie duas notas fiscais e chame o
		 * método calculaValor de cada uma, passando valores arbitrários.
		 */

		NotaFiscal notaFiscal1 = new NotaFiscal();
		notaFiscal1.setEmitente("Mercado Super");
		notaFiscal1.calculaValor(1000, 15);

		NotaFiscal notaFiscal2 = new NotaFiscal();
		notaFiscal2.setEmitente("Gimara");
		notaFiscal2.calculaValor(1000, 100);

		String txt = 
		"Nota Fiscal 1\nEmitente: " + notaFiscal1.getEmitente() + "\nValor com desconto: "+  notaFiscal1.getValor() 
		+ "\n\nNota Fiscal 2\nEmitente: " + notaFiscal2.getEmitente() + "\nValor com desconto: " + notaFiscal2.getValor();
		JOptionPane.showMessageDialog(null, txt);
	}

}
