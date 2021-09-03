package br.com.exceptions.beans;

public class Login {

	private String usuario;
	private String senha;
	
	public Login() {}

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	};
	
	public boolean fazerLogin(String usuario, String senha) {
		if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
			return true;
		} else if (this.usuario != usuario || this.senha != senha) {
			System.out.println("Usuário ou Senha incorreto");
			return false;
	}
		return false;
	}
}