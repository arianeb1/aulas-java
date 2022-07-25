package com.ezequiel.aulas.aula16;

public class Aluno extends Pessoa {

	private int ano;
	private String turma;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome) {
		//super();  o método super() chama o construtor da classe mae,
		//mas não é obrigario ter no método pois ele ja esta implicito.
		setNome(nome);
	}
	
	//metodo de aluno, não sobrescreve e nem era de ninguem
	public String consultarNotas() {
		return "nota consultada Aluno";
	}
	
}
