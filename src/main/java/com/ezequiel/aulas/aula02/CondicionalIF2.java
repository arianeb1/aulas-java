package com.ezequiel.aulas.aula02;

public class CondicionalIF2 {

	public static void main(String[] args) {
		int idade = 6;
		if(idade >=5 && idade <= 7) {
			System.out.println("Infantil");
		}else if(idade >= 8 && idade <=10) { // podemos ter varias condicoes a serem testadas, neste caso podemos usar o 'else if'
			System.out.println("Juvenil");
		}else if(idade >=11 && idade <= 15) {
			System.out.println("adolescente");
		}else if(idade >=16 && idade <=30) {
			System.out.println("Adulto");
		}else if(idade > 30) {
			System.out.println("Senior");
		}else {
			System.out.println("Idade menor que a aceita");
		}
	}
}
