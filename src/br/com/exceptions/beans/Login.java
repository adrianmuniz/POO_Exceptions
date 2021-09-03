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
		try {
			if (!this.usuario.equals(usuario)) {
				throw new Exception("Usuário incorreto");
			} else if (!this.senha.equals(senha)) {
				throw new Exception("Senha Incorreta");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		System.out.println("Acesso liberado!");
		return true;
}
}	