package com.ezequiel.aulas.aula07;

import java.util.Random;

public class RandonString {

	public static void main(String[] args) {
		int qnt = 100;
		String palavra= gerarStringAleatoria(qnt);
		System.out.println("String Aleantoria: "+palavra);
	}

	private static String gerarStringAleatoria(int qnt) {
		String letras = "abcdefghijklmnopqrstuvxzABCDEFGHIJKLMNOPQRSTUVXZ0123456789";
		System.out.println(letras.length());
		Random randon = new Random();
		String palavra = "";
		int cont = 0;
		while( cont < qnt) {
			int index = randon.nextInt(0);
			palavra+=letras.charAt(index);
			cont++;
		}
		
		return palavra;
		
	}
}
