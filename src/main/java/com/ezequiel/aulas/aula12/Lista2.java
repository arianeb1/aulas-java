package com.ezequiel.aulas.aula12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		System.out.println(numeros);
		
		numeros.add(1,2);
		System.out.println(numeros);
		
		numeros.clear();
		System.out.println(numeros.size());

		numeros.add(1); //posicao 0
		numeros.add(2);//posicao 1
		numeros.add(3); //posicao 2
		numeros.add(2);  //posicao 3
		numeros.add(2);  //posicao 4
		numeros.add(10);  //posicao 5
		
		System.out.println(numeros.contains(1));
		System.out.println(numeros.contains(10));
		System.out.println("ContainsAll"+ numeros.containsAll(Arrays.asList(1,2)));
		
		System.out.println("Equals: "+numeros.equals(Arrays.asList(1,2,3)));
		
		numeros.forEach(n -> System.out.println("numero "+n));
		//linha acima é igual ao código abaixo
		for(int n : numeros) {
			System.out.println("numero "+n);
		}
		
		numeros.forEach(n -> {
			System.out.println("numero "+n);
			System.out.println("soma ="+ (n+n));
		});
		//o primeiro elemento é a posicao 0
		System.out.println("numero Posicao 0: "+ numeros.get(0));
		//cuidado ao pegar o ultimo elemento da lista, sempre vai ser o tamanho da lista menos 1
		System.out.println("Numero ultima Posicao : "+ numeros.get(numeros.size() -1));
		
		System.out.println("IndexOf: "+ numeros.indexOf(2));
		System.out.println("LastIndexOf: "+ numeros.lastIndexOf(2));
		
		System.out.println("isEmpty: "+numeros.isEmpty());
		System.out.println("isEmpty: "+new ArrayList<>().isEmpty());
		
		//linha abaixo nao compila pois a lista é nula, nulo é diferente de vazio
		//List<String> listaNula = null;
		//System.out.println("isEmpty: "+listaNula.isEmpty());
		
		//se tentarmos remover um item do tipo inteiro de uma lista, vai ser considerado o index e nao o elemento
		numeros.remove(2);
		System.out.println(numeros);

		
		List<String> letras = new ArrayList<String>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		letras.remove("A");
		letras.remove(0);
		
		System.out.println(letras);
		
		
		int cont = 10;
		while( cont > 0) {
			if(numeros != null && numeros.size() >= cont) {
				numeros.remove(numeros.size() - 1);
			}else {
				cont = 0;
			}
			cont --;
		}
		System.out.println("numeros:"+numeros);

		
	}
}
