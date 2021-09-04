package br.com.exceptions.implementacao;

import java.util.Scanner;

import br.com.exceptions.beans.ContaBancaria;

public class ExecutarContaBancaria {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		ContaBancaria conta = new ContaBancaria(0.0, 200.0);
		
		double quantidade;
		
		System.out.println("Valor do deposito");
		conta.depositar(leitor.nextDouble());
		System.out.println(conta.getSaldo());
		
		System.out.println("Digite o valor de saque:");
		conta.sacar(leitor.nextDouble());
		
		
	}

}
