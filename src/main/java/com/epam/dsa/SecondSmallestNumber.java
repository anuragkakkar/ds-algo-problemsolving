package com.epam.dsa;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int[] a = new int[] {3, 4, 5, 6, 1, 2};
		System.out.println(findMin(a));
		
		a = new int[] {1, 2};
		System.out.println(findMin(a));
		
	}
	
	private static int findMin(int[] a) {
		
		if(a.length < 2) return 0;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			}
			else if(a[i] < secondSmallest) {
				secondSmallest = a[i];
			}
		}
		
		return secondSmallest;
		
	}

}
