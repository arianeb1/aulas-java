package com.ezequiel.aulas.aula15;

public class Main {

	public static void main(String[] args) {
		Suv suv = new Suv();
		suv.setNome("Pulse");
		suv.setFabricante("Fiat");
		suv.setAno(2022);
		suv.testeMetodoSobrescrita();
		
		Ret ret = new Ret();
		ret.setNome("Corsa");
		ret.testeMetodoSobrescrita();
		
		Caminhote caminhote = new Caminhote();
		caminhote.setNome("SW4");
		caminhote.testeMetodoSobrescrita();
		
	}
}
