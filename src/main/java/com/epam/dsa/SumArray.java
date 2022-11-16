package com.epam.dsa;

public class SumArray {
	
	public static void main(String[] args) {
		
		int[] elements = new int[] {1, 8, 6, 7, 3, 10, 15, 4, 2};
		
		System.out.println(iterativeSum(elements));
		System.out.println(recursiveSum(elements, 0));

	}

	//This requires O(n) time complexity and no extra space.
	private static int iterativeSum(int[] elements) {
		int sum = 0;
		
		for(int i = 0; i < elements.length; i++) {
			sum += elements[i];
		}
		
		return sum;
		
	}
	
	//This requires extra space.
	private static int recursiveSum(int[] elements, int n) {
		
		if(n >= elements.length) return 0;
		
		return elements[n] + recursiveSum(elements, n + 1);
		
	}

}
