package com.ezequiel.aulas.aula16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Jose");
		
		Professor professor = new Professor();
		professor.setNome("Maria");
		
		professor.lancarNota(aluno, "Matemática", 6);
		List<String> materias = Arrays.asList("Geografia", "Historia");
		professor.lancarNota(aluno, materias, 0);
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno);
		alunos.add(new Aluno("Pedro"));
		
		professor.lancarNota(alunos, "quimica", 8);
		
		professor.lancarNota(aluno, " Ingles ", 7, 1);
		
		System.out.println(aluno.comprarLanche("Hamburguer"));
		
		System.out.println(professor.comprarLanche("Hamburguer"));
		
		Diretor diretor = new Diretor();
		diretor.setNome("Francisco");
		
		System.out.println(diretor.comprarLanche("Hamburguer"));
		
		
		Coordenador coordenador = new Coordenador();
		coordenador.setNome("Marcia");
		System.out.println(coordenador.comprarLanche("Hamburguer", 50));
		
		//este metodo nao é sobrescrita e nem sobrecarga, é um metodo exclusivo de aluno
		System.out.println(aluno.consultarNotas());
		
		//metodo herdado da classe docente
		System.out.println(professor.consultarNotas());
		
		//metodo herdado da classe docente
		System.out.println(coordenador.consultarNotas());
		
		//sobrescrita do metodo consultarNotas da class
		//sobrescrita é reescrever um metodo existente na classe mae
		System.out.println(diretor.consultarNotas());
		
		
	}
}
