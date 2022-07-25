package com.ezequiel.aulas.aula13;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {

	private String nome;
	private String sobrenome;
	private Calendar dtNascimento;
	private ArrayList<Endereco> enderecos;

	public Cliente(String nome, String sobrenome, Calendar dtNascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
	}

	public Cliente(String nome, String sobrenome, Calendar dtNascimento, ArrayList<Endereco> enderecos) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
		this.enderecos = enderecos;
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

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
