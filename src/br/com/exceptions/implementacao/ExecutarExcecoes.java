package br.com.exceptions.implementacao;

import java.util.Scanner;

public class ExecutarExcecoes {

	public static void main(String[] args) {
		Scanner leitor  = new Scanner (System.in);
		
		try {
			// trecho onde pode acontecer uma excecao
			System.out.println("Digite valor 1");
			int v1 = leitor.nextInt();
			System.out.println("Digite valor 2");
			int v2 = leitor.nextInt();
			
			System.out.println("Soma:" + (v1 + v2));
			
		} catch (Exception e) {
			// onde as excecoes são tratadas
			System.out.println("Erro");
			
		}

	}

}
