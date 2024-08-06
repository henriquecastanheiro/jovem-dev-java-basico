package Desafio;

public class ItemVenda {
	private Produto produto;
	private int quantidade;

	public ItemVenda(Produto produto, int quantidade) {
		if (quantidade < 0 || quantidade > 50) {
			throw new IllegalArgumentException("Quantidade de produto deve ser entre 0 e 50.");
		}
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getTotal() {
		return produto.getPreco() * quantidade;
	}
}
