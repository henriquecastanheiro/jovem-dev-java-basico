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
			// Verifica se a quantidade de itens é válida entre 1 e 10
			if (qtddItens <= 0 || qtddItens > 10) {
				throw new VendaException(null);
			}

			for (int i = 0; i < qtddItens; i++) {
				Item item = new Item();
				item.nome = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + "º item: ");

				// Loop validar o preço do item
				do {
					try {
						item.preco = Double
								.parseDouble(JOptionPane.showInputDialog("Informe o valor de " + (item.nome) + ": "));
						// Verifica se o preço é válido, maior que 0
						if (item.preco <= 0) {
							throw new PrecoIncorretoException(null);
						}
					} catch (PrecoIncorretoException e) {
						// Exibe mensagem de erro se o preço for inválido
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
				} while (item.preco <= 0);

				venda.itens.add(item);
			}

			venda.setItens(venda.itens);
			// Gera e exibe o cupom fiscal
			JOptionPane.showMessageDialog(null, venda.geraCupomFiscal());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro 05: Entre em contato com henrique_castanheirotb@gmail.com");
		}
	}
}
