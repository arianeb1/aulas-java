package com.ezequiel.aulas.aula02;

public class RepeticaoFor {

	public static void main(String[] args) {
		/*
		 * usado para executar uma serie de repeticoes pre-determinas
		 * sintaxe: 
		 * declaracao de um contador com um valor inicial(int contador =0); 
		 * funcao de verificação( contador > 100); 
		 * incremento do contador(contador ++)
		 */
		for(int contador =100; contador > 0; contador --) {
			System.out.println("contador:"+ contador);
		}
		
		 /*
		  * ponto de atenção: verificar sempre se o contador esta sendo incrementado 
		  * e se a condição em algum momento sera finalidade para evitar o loop infinido.
		  * o caso a seguir nunca sera finalizado, pois inicializado o contador com o valor 10 e verificamos se o contador < 10, 
		  * neste caso o contador esta sempre incrementado em 1, logo o valor nunca será menor que da
		  for(int contador =10; contador <10 ; contador ++) {
			System.out.println("contador:"+ contador);
			}
		  */
	}
}
