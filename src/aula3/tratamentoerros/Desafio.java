package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {

		try {
			Venda venda = new Venda();
			venda.setNomeCliente(JOptionPane.showInputDialog(
					"Informe o nome do cliente: "));
			int qtddItens = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe a quantidade de itens:"));
			if (qtddItens <= 0 || qtddItens > 10) {
				throw new VendaException(null);
			}

			for (int i = 0; i < qtddItens; i++) {
				Item item = new Item();
				item.nome = JOptionPane.showInputDialog(
						"Informe o nome do " + (i + 1) + "º item: ");
				do {
					try {
						item.preco = Double.parseDouble(JOptionPane.showInputDialog(
										"Informe o valor de " + (item.nome) + ": "));
						if (item.preco <= 0) {
							throw new PrecoIncorretoException(null);
						}
					} catch (PrecoIncorretoException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
				} while (item.preco <= 0);

				venda.itens.add(item);
			}
			venda.setItens(venda.itens);
			JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}