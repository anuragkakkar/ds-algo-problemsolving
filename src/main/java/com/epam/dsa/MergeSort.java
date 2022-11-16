package com.epam.dsa;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] inputArray = new int[10];
		
		for(int i = 0;i < inputArray.length; i++) {
			inputArray[i] = rand.nextInt(100);
		}
		
		System.out.println("Before Array:");
		printArray(inputArray);
		
		mergeSort(inputArray);
		
		System.out.println("\nAfter Array:");
		printArray(inputArray);

	}
	
	private static void mergeSort(int[] inputArray) {
		int inputLength = inputArray.length;
		
		if(inputLength <= 1) return;
		
		int midIndex = inputLength / 2;
		int[] leftPart = new int[midIndex];
		int[] rightPart = new int[inputLength - midIndex];
		
		for(int i = 0; i < midIndex; i++) {
			leftPart[i] = inputArray[i];
		}
		for(int i = midIndex; i < inputLength; i++) {
			rightPart[i - midIndex] = inputArray[i];
		}
		
		mergeSort(leftPart);
		mergeSort(rightPart);
		merge(inputArray, leftPart, rightPart);
	}
	
	private static void merge(int[] inputArray, int[] leftPart, int[] rightPart) {
		int leftSize = leftPart.length;
		int rightSize = rightPart.length;
		
		int i = 0, j = 0, k = 0;
		while(i < leftSize && j < rightSize) {
			if(leftPart[i] <= rightPart[j]) {
				inputArray[k] = leftPart[i];
				i++;
			}
			else {
				inputArray[k] = rightPart[j];
				j++;
			}
			k++;
		}
		
		while(i < leftSize) {
			inputArray[k] = leftPart[i];
			i++;
			k++;
		}
		while(j < rightSize) {
			inputArray[k] = rightPart[j];
			j++;
			k++;
		}
	}
	
	private static void printArray(int[] array) {
		for(int i = 0;i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
