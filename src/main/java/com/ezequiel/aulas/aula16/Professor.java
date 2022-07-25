package com.ezequiel.aulas.aula16;

import java.util.List;

public class Professor extends Docente {

	private List<Aluno> alunos;
	private List<String> turmas;
	
	//sobrecarga de métodos, temos o metodo lancarNoda implemtando varias vezes com parametros diferentes
	public void lancarNota(Aluno aluno, String materia, double nota) {
		StringBuilder buider = new StringBuilder();
		buider.append("A nota do Aluno ");
		buider.append(aluno.getNome());
		buider.append(" na materia ").append(materia)
		.append(" foi de ").append(nota ).append(" pontos.");
		
		System.out.println(buider.toString());
	}
	
	public void lancarNota(List<Aluno> alunos, String materia, double nota) {
		StringBuilder buider = new StringBuilder();
		buider.append("A nota dos Alunos ");
		for(Aluno aluno : alunos) {
			buider.append(aluno.getNome()).append(", ");
		}
		
		buider.append(" na materia ").append(materia)
		.append(" foi de ").append(nota ).append(" pontos.");
		
		System.out.println(buider.toString());
	}
	
	public void lancarNota(Aluno aluno, List<String> materias, double nota) {
		StringBuilder buider = new StringBuilder();
		buider.append("As nota do Aluno ");
		buider.append(aluno.getNome());
		String materiasStr = String.join(", ", materias);
		buider.append(" nas materias ").append(materiasStr)
		.append(" foi de ").append(nota ).append(" pontos.");
		
		System.out.println(buider.toString());
	}
	
	public void lancarNota(Aluno aluno, String materia, double nota, double pontoExtra) {
		String conteudo = "A nota do Aluno ";
		conteudo = conteudo.concat(aluno.getNome());
		conteudo+=" na materia "+ materia;
		conteudo = conteudo + " foi de " + ( nota + pontoExtra) + " pontos";
		
		System.out.println(conteudo);
	}
	
	
}
