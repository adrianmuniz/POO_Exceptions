package br.com.exceptions.implementacao;

import java.util.Scanner;

import br.com.exceptions.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {
		Scanner leitor  = new Scanner (System.in);
		
		
		Login login = new Login("Adm", "123");
		
		System.out.println("Login:");
		String usuario = leitor.next();
		System.out.println("Senha:");
		String senha = leitor.next();
		System.out.println(login.fazerLogin(usuario, senha));

	}

}
