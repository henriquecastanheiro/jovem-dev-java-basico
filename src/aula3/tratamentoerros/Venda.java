package aula3.tratamentoerros;

import java.util.ArrayList;

public class Venda {
	private String nomeCliente;
	ArrayList<Item> itens;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public String geraCupomFiscal() {
		String txt = "      CUPOM FISCAL \n\n"
			+ "Nome do cliente: " + this.nomeCliente
			+ "  \nQuantidade de itens: " + this.itens.size()
			+ "  \n                \nProdutos comprados: \n";
		
		double total = 0;
			for (Item i : itens) {
				txt += "\t-> " + i.getNome() + "\nPreço: R$ " + i.getPreco() + "\n\n";
				total += i.getPreco();
			}			
			
			txt += "===TOTAL: R$ "+ total + "===" + "\n\n------ VOLTE SEMPRE! ------";
			
		return txt;
	}
}