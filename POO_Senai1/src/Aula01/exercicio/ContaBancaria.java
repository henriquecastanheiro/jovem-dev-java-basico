package Aula01.exercicio;

import javax.swing.JOptionPane;

public class ContaBancaria {
	
	String numeroConta;
	String nomeTitular;
	double saldo;
	
	public ContaBancaria(String numeroConta, String nomeTitular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double saldoAtual) {
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depositado: "));
		if(deposito <= 0){
			JOptionPane.showMessageDialog(null, "Depósito Inválido! \nO valor do depósito deve ser positivo ");
		} else {
			saldoAtual += deposito;
			JOptionPane.showMessageDialog(null,"Você depositou R$: " + deposito + "\nDeposito realizado com sucesso!");
		}
		return saldoAtual;
	}
	
	public double sacar(double saldoAtual) {
		double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
		if(saque <= 0){
			JOptionPane.showMessageDialog(null, "Saque Inválido!");
		}
		else if (saque > saldoAtual){
			JOptionPane.showMessageDialog(null, "Saque Inválido, Confira seu saldo atual!");
		}else {
			saldoAtual -= saque;
			JOptionPane.showMessageDialog(null, "Você fez um saque de R$: " + saque + "\nSaque realizado com sucesso!");
	}
		return saldoAtual;}
}
