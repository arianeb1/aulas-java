package com.ezequiel.aulas.aula16;

import java.util.List;

public class Diretor extends Docente {

	@Override
	public String comprarLanche(String produto) {
		return produto +" sai de graça";
	}
	//sobrescrita
	//neste caso estou sobrescrevendo o metodo da classe mae, temos o mesmo tipo de retorno e assinatura ( nome do metodo e parametros)
	@Override
	public String consultarNotas() {
		return "nota consultada por Diretor";
	}
	
	//sobrecarga e sobrescrita do do metodo consultarNotas
	@Override
	public String consultarNotas(String nomeAluno) {
		return "nota consultada por Diretor para o aluno "+ nomeAluno;
	}
	
	//sobrecarga do metodo consultarNotas 
	public String consultarNotas(List<String> alunos) {
		return "Nota consultada por diretor para os alunis"
				+ String.join(", ", alunos);
	}
}
