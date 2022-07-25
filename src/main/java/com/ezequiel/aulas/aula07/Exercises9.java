/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezequiel.aulas.aula07;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author floodd
 */
public class Exercises9 {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 9, 8, 7, 6, 2, 3, 0, 4};
//        List<int> nuns = Arrays.asList(1,25,7);
//        nuns.get(0);
        Scanner kb = new Scanner(System.in);
        System.out.println("i. all the elements in the array ");
        // print using own for loop
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
        // using enhanced for loop
        System.out.print("[");
        for (int x : numbers) {
            System.out.print(x + ", ");
        }
        System.out.println("]");

        //using the arrays class
        System.out.println(Arrays.toString(numbers));

        System.out.println("ii. all the elements in the array in reverse order");
        System.out.print("[");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
        System.out.println("iii. the average of all the values in the array.");
        int total = 0;
        for (int x : numbers) {
            total += x;
        }

        System.out.println("The average is : "
                + ((double) total / numbers.length));

        System.out.println("iv. whether the array is in ascending order ");
        boolean isAscending = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i + 1] < numbers[i]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The values are in ascending order.");
        } else {
            System.out.println("Values are not in ascending order.");
        }
        System.out.println("Part v");
        int max = numbers[0];
        for(int i = 1; i < numbers.length;i++)
        {
            if(max < numbers[i])
            {
                max = numbers[i];
            }
        }
        System.out.println("The highest value is " + max);
        System.out.println("Part vi ");
        
        int min = numbers[0];
        for(int i = 1; i < numbers.length;i++)
        {
            if(min > numbers[i])
            {
                min = numbers[i];
            }
        }
        System.out.println("The lowest value is " + min);
        System.out.println("Part vii ");
        int minIndex = 0;
        for(int i = 1; i < numbers.length;i++)
        {
            if(numbers[minIndex] > numbers[i])
            {
                minIndex= i;
            }
        }
        System.out.println("The smallest number is at index " + minIndex);
        int countEven = 0;
        int totalEven = 0;
        for(int i = 0; i < numbers.length;i++)
        {
            if(numbers[i]%2==0)
            {
                countEven++;
                totalEven+=numbers[i];
            }
        }
        double avg = totalEven/(double)countEven;
        System.out.println("The average of the even numbers is " + avg);
        
        boolean isFound=false;
        int toFind = 0;
        System.out.println("Please enter number to find: ");
        toFind = kb.nextInt();
        for(int x: numbers)
        {
            if(x == toFind)
            {
                isFound = true;
            }
         
        }
        System.out.println(toFind + " is present: " + isFound);
        
        int position = -1;
        for(int i = 0; i < numbers.length;i++)
        {
            if(numbers[i] == toFind)
            {
                position = i;
            }
        }
        System.out.println("The value is at position " + position);
        
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(copyNumbers);
        System.out.println("Copy: " + Arrays.toString(copyNumbers));
        int positionBinS = Arrays.binarySearch(copyNumbers, toFind);
        System.out.println("Binary Search Results: " + positionBinS);
        int positionBinS2 = Arrays.binarySearch(numbers, toFind);
        System.out.println("Binary Search Results: " + positionBinS2);
    }
}

