package avaliacao.semana1;

import javax.swing.JOptionPane;

public class ItemVenda {
	
	private void add(Produto produto) {
		
	}

	public static void comprasProduto() {
		ItemVenda itemVenda = new ItemVenda();
		Produto produto = new Produto();
		do {
			produto.setNomeProduto(JOptionPane.showInputDialog(
					"Informe o nome do produto: "));
			if(!produto.nomeProduto.equals("fim")){
				produto.setPrecoPorUnidade(Double.parseDouble(JOptionPane.showInputDialog(
						"Digite o preço unitário de " + (produto.getNomeProduto()) +": ")));
				produto.setQtdd(Integer.parseInt(JOptionPane.showInputDialog(
						"Digite a quantidade de " + (produto.getNomeProduto()) + ": ")));
				itemVenda.add(produto);
			}
		} while (produto.nomeProduto.equals("fim"));
	}
}

	


