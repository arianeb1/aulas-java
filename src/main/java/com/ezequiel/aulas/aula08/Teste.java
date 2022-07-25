package com.ezequiel.aulas.aula08;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		Usuario objetoUsuario = new Usuario();
		objetoUsuario.name = "Ezequiel";
		objetoUsuario.dataNasc = "1987-10-26";
		List<String> telefones = new ArrayList<String>();
		
		
		telefones.add("(11)99999-8888");
		telefones.add("(22)8888-7777");
		
		System.out.println(telefones.get(0));
		
		objetoUsuario.telefones = telefones;
		
		Usuario objetoUsuario2 = new Usuario();
		objetoUsuario2.name = "Ariane";
		
	}
	
	
}
