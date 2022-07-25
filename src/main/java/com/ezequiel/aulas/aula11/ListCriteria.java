package com.ezequiel.aulas.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListCriteria {

	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(new Usuario("Ezequiel", "Braganca", "11 5555-5555"));
		usuarios.add(new Usuario("Geraldo", "Braganca", "31 6666-5555"));
		usuarios.add(new Usuario("Eliana", "Lima", "11 7777-7777"));
		usuarios.add(new Usuario("Ezequiel", "Silva", "31 4444-5555"));
		usuarios.add(new Usuario("Ariane", "Lima", "11 3333-5555"));
		
		List<Usuario> usuariosPesquisa = new ArrayList<Usuario>();
		for(Usuario usuario : usuarios) {
			if(usuario.getSobrenome().equals("Braganca"))
				usuariosPesquisa.add(usuario);
		}
		System.out.println(usuariosPesquisa);
		
		
		List<Usuario> usuariosPesquisaLambda = usuarios.stream()
				.filter(n -> n.getSobrenome().equals("Braganca")).collect(Collectors.toList());

		System.out.println(usuariosPesquisaLambda);
	}
}
