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
			e.printStackTrace();
			System.out.println(e.getClass());
		}

		// Exemplo 2
		
		Scanner sc  = new Scanner (System.in);
		String senha = "12345";
		
		try {
			// trecho onde pode acontecer uma excecao
			System.out.println("Digite palavra SECRETA:");
			String secreta = sc.nextLine();
			
			if(!senha.equals(secreta)) {
				throw new Exception("Incorreta");
			}
			
			System.out.println("Acesso liberado");
			
		} catch (Exception e) {
			// onde as excecoes são tratadas
			//System.out.println("Erro");
			System.out.println(e.getMessage());
		}
		
	}

}
