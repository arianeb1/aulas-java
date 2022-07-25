package com.ezequiel.aulas.aula16;

import java.util.Date;
import java.util.List;

public class Pessoa {

	private String nome;
	private Date dtNascimento;
	private List<Endereco> enderecos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public String comprarLanche(String produto) {
		return produto + " comprado";
	}
	
	public Pessoa () {
		System.out.println("construtor de pessoa");
	}
	
	public Pessoa ( String nome) {
		this.nome = nome;
	}
	
}
