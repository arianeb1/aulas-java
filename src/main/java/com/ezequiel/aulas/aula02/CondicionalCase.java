package com.ezequiel.aulas.aula02;

public class CondicionalCase {

	public static void main(String[] args) {
		int diaDaSemana = 1;
		switch (diaDaSemana) {  //  testa o valor de uma variável, e dependendo do valor contido nessa variável, permite executar
		 //uma entre múltiplas escolhas de ações
		case 1:
			System.out.println("Aula de Java");
			break; //  break é obrigatório em todas as condicionais
		case 2:
			System.out.println("Dia de reposicao");
			break;
		case 3:
			System.out.println("Dia de feira");
			break;
		case 4:
			System.out.println("aula de inglês");
			break;
		default:
			System.out.println("é outro dia");
			break;
		}
	}
}
