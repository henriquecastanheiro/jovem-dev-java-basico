package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class NotaFiscal {

	private String emitente;
	private double valor;

	public String getEmitente() {
		return emitente;
	}

	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}

	public double getValor() {
		return valor;
	}

	public void calculaValor(double valorBruto, double percDesconto) {
		//Validação de Desconto
		if (percDesconto >= 100) {
			JOptionPane.showMessageDialog(null, 
					"Erro de Desconto: Não é possível dar um desconto de 100% ou mais");
			this.valor = valorBruto;
		} else if (percDesconto < 0) {
			JOptionPane.showMessageDialog(null, 
					"Erro de Desconto: Não é possível dar um desconto negativo");
			this.valor = valorBruto;
		} else {
			this.valor = valorBruto - (valorBruto * (percDesconto / 100));
		}
	}
}
