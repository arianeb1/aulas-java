package com.ezequiel.aulas.aula16;

public class Docente extends Funcionario {

	public String consultarNotas() {
		return "nota consultada por Docente";
	}
	
	//sobrecarga do metodo consultarNotas, temos o mesmo nome para o metodo, mas com parametros diferentes
	public String consultarNotas(String nomeAluno) {
		return "nota consultada por Docente para o aluno "+ nomeAluno;
	}
}
