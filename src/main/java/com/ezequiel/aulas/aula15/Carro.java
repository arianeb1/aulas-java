package com.ezequiel.aulas.aula15;

public class Carro {

	private String nome;
	private String fabricante;
	private int ano;
	private String cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	protected void andarParaFrente() {

	}

	protected void andarParaTraz() {

	}
	
	protected void testeMetodoSobrescrita() {
		System.out.println("Metodo do pai");
	}

}
