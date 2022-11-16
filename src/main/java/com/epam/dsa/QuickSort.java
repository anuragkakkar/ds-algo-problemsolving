package com.epam.dsa;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] inputArray = new int[10];
		
		for(int i = 0;i < inputArray.length; i++) {
			inputArray[i] = rand.nextInt(100);
		}
		
		System.out.println("Before Array:");
		printArray(inputArray);
		
		quickSort(inputArray);
		
		System.out.println("After Array:");
		printArray(inputArray);

	}
	
	private static void quickSort(int[] inputArray) {
		quickSort(inputArray, 0 , inputArray.length - 1);
	}
	
	private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {
		
		if(lowIndex >= highIndex) return;
		
		//1. Choosing a Pivot.
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		swap(inputArray, pivotIndex, highIndex);
		int pivot = inputArray[highIndex];
		
		//2. Partitioning.
		int leftPointer = partition(inputArray, lowIndex, highIndex, pivot);
		
		//3. Placing pivot in its correct position.
		swap(inputArray, leftPointer, highIndex);
		
		quickSort(inputArray, lowIndex, leftPointer - 1); // For left part of the pivot.
		quickSort(inputArray, leftPointer + 1, highIndex); // For right part of the pivot.
	}

	private static int partition(int[] inputArray, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while(leftPointer < rightPointer) {
			while(inputArray[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(inputArray[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(inputArray, leftPointer, rightPointer);
		}
		return leftPointer;
	}
	
	private static void swap(int[] inputArray, int index1, int index2) {
		int temp = inputArray[index1];
		inputArray[index1] = inputArray[index2];
		inputArray[index2] = temp;
	}
	
	private static void printArray(int[] array) {
		for(int i = 0;i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
