package br.com.exceptions.implementacao;

import java.util.Scanner;

import br.com.exceptions.beans.meuControleException;

public class executarExceptionClass {

	public static void main(String[] args) throws meuControleException {
		Scanner leitor = new Scanner (System.in);
		
		try {
			System.out.println("Digite valor 1");
			int v1 = leitor.nextInt();
			System.out.println("Digite valor 2");
			int v2 = leitor.nextInt();
			
			System.out.println("Soma:" + (v1 + v2));
			
		} catch (Exception e) {
			throw new meuControleException("Erro no valor", e);
		}

	}

}
