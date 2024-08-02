package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.Item;

public class Venda {
	
	ArrayList<Item> itemVenda;
	
	public void add(Cliente cliente) {

	}
	
	public static void informacaoCliente() {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		cliente.setNome(JOptionPane
				.showInputDialog(null, "Digite o nome do Cliente: "));
		String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento de "+cliente.getNome()+": (dd/MM/yyyy)" );
		try {
			cliente.setDataNascimento(LocalDate.parse(dataNascimento, format));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro 05: Entre em contato com henrique_castanheirotb@gmail.com");
		}
		venda.add(cliente);
		}
		
	public void geraCupomDesconto() {
		int formaPagamento = Integer.parseInt(JOptionPane.showInputDialog(null, 
				"Forma de Pagamento\n\n" 
				+ "1-Cartão de Crédito" 
				+"\n2 - Cartão de Débito " 
				+ "\n3 - Dinheiro"));
		
		String txt = "************ CUPOM ************";
		
	}
}




