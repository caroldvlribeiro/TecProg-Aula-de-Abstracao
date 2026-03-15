package br.edu.fatecpg.tecprog.abstracao.model;

public class ContaBancaria {

	public int numeroConta;
	public int numeroAgencia;
	public double saldo;
	public String tipoConta;
	public String nomeCliente;

	public void consultarSaldo() {
		System.out.println("Consultando saldo da conta: " + this.numeroConta + "\nCliente: " + this.nomeCliente
				+ "\nSaldo atual: R$ " + this.saldo);
	}

	public void transferir() {
		System.out.println("Transferência realizada da conta " + this.numeroConta + "\nAgência: " + this.numeroAgencia
				+ "\nCliente: " + this.nomeCliente);
	}

	public void depositar() {
		System.out.println("Depósito realizado na conta " + this.numeroConta + "\nNovo saldo: R$ " + this.saldo);
	}
}