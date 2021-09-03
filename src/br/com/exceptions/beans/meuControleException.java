package br.com.exceptions.beans;

public class meuControleException extends Exception {

	public meuControleException(String msg, Exception e) {
		super(msg, e);
		// agora é minha implementacao
		System.out.println("------ meu  exception -------");
		System.out.println(msg);
	}
	
}
