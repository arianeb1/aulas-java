package com.ezequiel.aulas.aula07;

import java.util.Arrays;

public class CopiaLista {

	public static void main(String[] args) {
		int[] numbers = {1, 5, 9, 8, 7, 6, 2, 3, 0, 4};
		printList(numbers);
		int [] copy = numbers;
		printList(copy);
		
		numbers[0] = 10;
		printList(numbers);
		printList(copy);
		
		System.out.println("FORMA CORRETA ");
		int [] copiacorreta = Arrays.copyOf(numbers, numbers.length);
		numbers[1] = 10;
		printList(numbers);
		printList(copiacorreta);
		
	}
	
	private static void printList(int[] list) {
		for (int value : list) {
			System.out.print(value + ",");
		}
		System.out.println("===========");
	}
}
