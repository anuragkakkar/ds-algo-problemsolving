package com.epam.dsa;

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array = new int[10];
		
		for(int i = 0;i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
		
		System.out.println("Before Array:");
		printArray(array);
		
		//Insertion Sort implementation
		for(int i = 1; i < array.length; i++) {
			int currentValue = array[i];
			
			int j = i - 1;
			while(j >= 0 && currentValue <= array[j]) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = currentValue;
		}
		
		System.out.println("\nAfter Array:");
		printArray(array);

	}
	
	private static void printArray(int[] array) {
		for(int i = 0;i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
