package model;

public class usuario {

	private  String Nome, Celular, Email, Senha;
	
	private boolean Estalogado = false;
	
	public usuario (String Nome, String Celular, String Email, String Senha, String nickname) {
		this.Nome = Nome;
		this.Celular = Celular;
		this.Email = Email;
		this.Senha = Senha;
	}
	 
	void Autenticacao(String Email, String Senha) {
		if (this.Email == Email && this.Senha == Senha) {
			Estalogado = true;
		}
	}
	public String getUsuario() {
		return (
				"\nNome" + this.Nome
				+ "\nCelular" + this.Celular
				+ "\nEmail" + this.Email
				+ "\nSenha" + this.Senha
				+ "\nEstalogado" + this.Estalogado
				);
		
	}

	public boolean validarcadastro(String confirmacaoSenha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
