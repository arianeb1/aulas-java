/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezequiel.aulas.aula05;

import java.util.Scanner;

/**
 *
 * @author Ariane
 */
public class valorMaximo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number:");
		int n1 = kb.nextInt();
		System.out.println("Another number:");
		int n2 = kb.nextInt();
		System.out.println("Enter another number");
		int n3 = kb.nextInt();

		int max = getMaximum(n1, n2, n3);
		System.out.println("max:" + max);
	}

	public static int getMaximum(int n1, int n2, int n3) {
		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		return max;
	}

	public static int getMaximum() {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number:");
		int n1 = kb.nextInt();
		System.out.println("Another number:");
		int n2 = kb.nextInt();
		System.out.println("Enter another number");
		int n3 = kb.nextInt();

		int max = n1 > n2 ? n1 : n2;
		max = max > n3 ? max : n3;
		return max;

	}

}
