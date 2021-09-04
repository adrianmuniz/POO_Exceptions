package br.com.exceptions.beans;

public class ContaBancaria {

	private double saldo;
	private double limite;
	
	public ContaBancaria() {}

	public ContaBancaria(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	};
	
	public void sacar (double valor) {
		if (valor <= saldo && valor < limite) {
			saldo -= valor;
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void depositar (double quantidade) {
		saldo += quantidade;
	}
}
