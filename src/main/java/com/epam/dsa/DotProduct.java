package com.epam.dsa;

public class DotProduct {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2};
		int[] array2 = {2, 3};
		
		System.out.println(dotProduct(array1, array2));

	}
	
	private static long dotProduct(int[] array1, int[] array2) {
		
		long result = 0;
		int n = array1.length < array2.length ? array1.length : array2.length;
		for(int i = 0; i < n; i++) {
			result += array1[i] * array2[i];
		}
		
		return result;	
	}

}
