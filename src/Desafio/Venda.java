package Desafio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Venda {

	private Cliente cliente;
	private List<ItemVenda> itens;
	private String formaPagamento;
	
	// Construtor para inicializar o cliente e a forma de pagamento
	public Venda(Cliente cliente, String formaPagamento) {
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
		this.itens = new ArrayList<>();
	}
	
	// Adiciona um item à lista de itens de venda
	public void adicionarItem(ItemVenda item) {
		itens.add(item);
	}
	
	// Calcule o subtotal da venda
	  public double calcularSubTotal() {
	        double subtotal = 0;
	        for (ItemVenda item : itens) {
	            subtotal += item.getTotal();
	        }
	        return subtotal;
	    }
	  public double calcularDesconto() {
	        double desconto = 0;

	        if (cliente instanceof ClientePremium) {
	            desconto = 0.20;
	        }

	        // Verifica se o cliente tem mais de 60 anos e aplica desconto de 10%
	        if (cliente.getIdade() > 60) {
	            if (desconto < 0.10) {
	                desconto = 0.10;
	            }
	        }

	        // Verifica se é aniversário do cliente e aplica desconto de 30%
	        if (cliente.diaAniversario()) {
	            if (desconto < 0.30) {
	                desconto = 0.30;
	            }
	        }
	        
	        return desconto;
	    }
	  public void imprimirCupom() {
		  // Inicia o texto do cupom
	        String cupom = "************ CUPOM ************\n";
	        
	        // Adiciona os itens ao cupom
	        for (ItemVenda item : itens) {
	            cupom += item.getProduto().getNome() + "\n";
	            cupom += item.getQuantidade() + "x " +
	                    String.format("%.2f", item.getProduto().getPreco()) + " ................ " +
	                    String.format("%.2f", item.getTotal()) + "\n";
	        }

	        // Calcula e adiciona o subtotal
	        double subtotal = calcularSubTotal();
	        cupom += "SubTotal ............... " + String.format("%.2f", subtotal) + "\n";

	        // Calcula e adiciona o desconto
	        double desconto = calcularDesconto();
	        if (desconto > 0) {
	            double valorDesconto = subtotal * desconto;
	            cupom += "Descto. " + (int) (desconto * 100) + "% ............... " +
	                    String.format("%.2f", valorDesconto) + "\n";
	            subtotal -= valorDesconto;
	        }

	        // Adiciona o total
	        cupom += "Total .................. " + String.format("%.2f", subtotal) + "\n";

	        // Adiciona a forma de pagamento e o nome do cliente
	        cupom += "Forma de pagamento: " + formaPagamento + "\n";
	        cupom += "Cliente: " + cliente.getNomeMascarado() + "\n";

	        // Exibe o cupom
	        JOptionPane.showMessageDialog(null, cupom);
	    }
	}
