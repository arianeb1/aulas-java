package com.ezequiel.aulas.aula05;

public class EscopoVariaveis {
	
	//variavel global, pode ser utilizada em quanquer ponto da classe
	private static String sobrenome;
	public static String variavelPublica;

	public static void main(String[] args) {
		int anoNascimento; // variavel local, só existe no escopo deste método
		
		anoNascimento = 1987;
		String nome = "Ariane";
		sobrenome = "Moura";
		System.out.println(sobrenome);
		calcularIdade();
		System.out.println(sobrenome);
	}
	
	
	private static void calcularIdade() {
		String sobrenome = "Lima"; // esta variavel possui o mesmo nome da variavel global, mas com escopo local
		String nome = "Ezequiel"; 
		System.out.println(sobrenome);
		sobrenome = "Braganca";
		System.out.println(sobrenome);
	}
}
