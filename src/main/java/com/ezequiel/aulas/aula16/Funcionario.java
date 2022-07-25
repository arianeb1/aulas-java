package com.ezequiel.aulas.aula16;

public class Funcionario extends Pessoa {

	private String cargo;
	
	private String setor;
	
	public boolean baterPonto() {
		System.out.println("Ponto efetuado com sucesso");
		return true;
	}
	
	public String comprarLanche(String produto) {
		return produto +" comprado com desconto de 10%";
	}
}
