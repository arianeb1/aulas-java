package com.ezequiel.aulas.aula12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,5,8,90,56); 
		System.out.println(duplicaLista(numeros, 2));
		
	}
	
	private static List<Integer> duplicaLista(List<Integer> list, int qnt){
		List<Integer> lstRetorno = new ArrayList<Integer>();
		while(qnt > 0) {
			lstRetorno.addAll(list);
			qnt--;
		}
		
		return lstRetorno;
	}
}
