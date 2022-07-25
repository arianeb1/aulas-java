package com.ezequiel.aulas.aula11;

public class Usuario {

	public String nome;
	public String sobrenome;
	public String telefone;
	
	public Usuario(String nome, String sobrenome, String telefone) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
}
