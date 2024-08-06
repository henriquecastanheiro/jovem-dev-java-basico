package Desafio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class SistemaDeVenda {

	public static void main(String[] args) {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String nome = null;
		while (nome == null) {
			nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
		}
		// Pergunta a data de nascimento do cliente e valida a entrada
		LocalDate dataNascimento = null;
		while (dataNascimento == null) {
			String strDataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento de " + nome + ": ");
			try {
				dataNascimento = LocalDate.parse(strDataNascimento, format);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Data de Nascimento inválida, Por favor tente novamente.");
			}
		}

		Cliente cliente;
		if (nome.equalsIgnoreCase("Thiago")) {
			cliente = new ClientePremium(nome, dataNascimento);
		} else {
			cliente = new Cliente(nome, dataNascimento);
		}

		// Pergunta a forma de pagamento e valida a entrada
		String formaPagamento = "";
		while (true) {
			formaPagamento = JOptionPane.showInputDialog(
					"FORMA DE PAGAMENTO \n\n1 - Cartão de Crédito \n2 - Cartão de Débito \n3 - Dinheiro");
			switch (formaPagamento) {
			case "1":
				formaPagamento = "Cartão de Crédito";
				break;
			case "2":
				formaPagamento = "Cartão de Débito";
				break;
			case "3":
				formaPagamento = "Dinheiro";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Forma de pagamento inválida, Por favor tente novamente.");
				continue;
			}
			break; // Sai do loop se a forma de pagamento for válida
		}

		Venda venda = new Venda(cliente, formaPagamento);

		while (true) {
			String nomeProduto = JOptionPane.showInputDialog("Nome do produto (ou 'fim' para encerrar):");
			if (nomeProduto.equalsIgnoreCase("fim")) {
				break;
			}

			double precoProduto = 0;
			while (true) {
				try {
					String precoProdutoStr = JOptionPane.showInputDialog("Preço por unidade:");
					precoProduto = Double.parseDouble(precoProdutoStr);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Preço inválido, por favor tente novamente.");
				}
			}

			int quantidadeProduto = 0;
			while (true) {
				try {
					String quantidadeProdutoStr = JOptionPane.showInputDialog("Quantidade:");
					quantidadeProduto = Integer.parseInt(quantidadeProdutoStr);
					break;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Quantidade inválida, por favor tente novamente.");
				}
			}

			try {
				Produto produto = new Produto(nomeProduto, precoProduto);
				ItemVenda item = new ItemVenda(produto, quantidadeProduto);
				venda.adicionarItem(item);
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			}
		}

		venda.imprimirCupom();
	}
}
