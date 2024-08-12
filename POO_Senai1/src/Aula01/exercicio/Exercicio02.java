package Aula01.exercicio;

import javax.swing.JOptionPane;

public class Exercicio02 {
	
// Implemente uma classe chamada “ContaBancária” que possua atributos para armazenar
// o número da conta, nome do titular e saldo. Adicione métodos para realizar depósitos e saques.
	
	public static void main(String[] args) {

		ContaBancaria conta = new ContaBancaria(null, null, 0);
		
		conta.setNomeTitular(JOptionPane.showInputDialog("Digite o nome do titular: "));
		conta.setNumeroConta(JOptionPane.showInputDialog(conta.getNomeTitular() + ", digite o número da sua conta: "));
		conta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(conta.getNomeTitular() + ", digite o saldo da sua conta:")));

		int opcao;
		do {
			String menu = "       MENU \n\nNome: " + 
					conta.getNomeTitular()+ "\nConta: " + conta.getNumeroConta() + "\nSaldo: " + conta.getSaldo()
									+ "\n\nOpção:\n\n1 - Depositar \n2 - Sacar \n0 - Sair";
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				double saldoAtualDeposito = conta.depositar(conta.getSaldo());
				conta.setSaldo(saldoAtualDeposito);
				break;
			case 2:
				double saldoAtualSaque = conta.sacar(conta.getSaldo());
				conta.setSaldo(saldoAtualSaque);
				
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				break;

			default:
				break;
			}
		} while (opcao != 0);
	}
}
