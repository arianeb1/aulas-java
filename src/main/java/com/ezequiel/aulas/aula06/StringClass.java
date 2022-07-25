package com.ezequiel.aulas.aula06;

public class StringClass {
	public static void main(String[] args) {
		String nome = "Ezequiel";
		String sobrenome = "Moura";
		// concatenacao
		String nomecompleto = nome + " " + sobrenome;
		System.out.println(nomecompleto);
		nomecompleto = nome.concat(" ").concat(sobrenome);
		System.out.println("Concatenacao: " + nomecompleto);

		System.out.println("CharAt:" + nome.charAt(1)); // retorna a letra na posico informada
		System.out.println("CompareTo:" + nome.compareTo(nomecompleto)); // verifica a diferenca de tamanho entre
																			// strings
		System.out.println("Contains: Ezequiel Moura contem M: " + nomecompleto.contains("M"));
		System.out.println("Contains: Ezequiel Moura contem X: " + nomecompleto.contains("X"));

		System.out.println("endsWith:" + nomecompleto.endsWith("a"));
		System.out.println("Equals:" + nome.equals("ezequiel")); // verifica se as Strings sao exatamente iguais
		System.out.println("EqualsIgnoreCase:" + nome.equalsIgnoreCase("ezequiel")); // verifica se as Strings sao
																						// iguais desconsiderado
																						// maiusculas e minusculas

		// indexOf = retorna o index do caracter informado
		System.out.println("IndexOf: " + nome.indexOf("z"));
		System.out.println("IndexOf: " + nome.indexOf("zeq"));
		System.out.println("IndexOf: " + nome.indexOf("x")); // se nao existir o catecter, informa -1
		System.out.println("IndexOf: " + nome.indexOf("e"));

		String blank = " ";
		String empty = "";
		
		System.out.println("isBlank:"+ blank.isBlank());
		System.out.println("isBlank:"+ empty.isBlank());
		System.out.println("isEmpty:"+ blank.isEmpty());
		System.out.println("isEmpty:"+ empty.isEmpty());
		
		String nomeReplace = " E X E";
		System.out.println("Replace: "+nomeReplace.replace("X", "Z").replace(" ", ""));
		System.out.println("Replace: "+nomeReplace.replace(String.valueOf(nomeReplace.charAt(3)), "Z"));
		
		System.out.println("Substring: "+ nome.substring(2, 4));
		
	
		
		

		// substring = retorna uma parte da String de acordo com a posicao informada
		System.out.println("Substring: " + nome.substring(0, 3));
		System.out.println("Substring: " + nome.substring(4, 7));
		// se atentar para nao pegar index invalido( maior que a palavra)
		// System.out.println(nome.substring(4,10));

		// lastIndexOf - retorna a ultimo index do caracter informado
		System.out.println("LastIndexOf" + nome.lastIndexOf("e"));

		// length = retorna o tamanho em caracterer da String
		System.out.println("length: " + nome.length());
		System.out.println("length: " + nomecompleto.length());

		if ("Ariane" == "Ariane") {
			System.out.println(
					"Nas versões mais antigas nunca vai entrar no IF pois Java compara o indice de memoria, e nao o conteudo");
		} else {
			System.out.println("Este if sempre será falso");
		}
		// recomendavel usar o equals
		if ("Ariane".equals("Ariane")) {
			System.out.println(
					"Nas versões mais antigas nunca vai entrar no IF pois Java compara o indice de memoria, e nao o conteudo");
		} else {
			System.out.println("Este if sempre será falso");
		}
		
		System.out.println("gdegfgrfdlkgfdljgfdg".length());

	}
}
