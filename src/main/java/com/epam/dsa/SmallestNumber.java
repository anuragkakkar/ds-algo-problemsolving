package com.epam.dsa;

public class SmallestNumber {

	public static void main(String[] args) {
		
		int[] a = new int[] {3, 4, 5, 6, 1, 2};
		System.out.println(findMin(a));
		
		a = new int[] {1, 2};
		System.out.println(findMin(a));

	}
	
	private static int findMin(int[] a) {
		
		if(a.length == 1) return a[0];
		
		int left = 0;
		int right = a.length - 1;
		
		//if there is no rotation
		if(a[right] > a[0]) {
			return a[0];
		}
		
		while(right > left) {
			int mid = left + (right - left) / 2;
			
			if (a[mid] > a[mid + 1]) {
                return a[mid + 1];
            }
			
			if (a[mid - 1] > a[mid]) {
                return a[mid];
            }
			
			if(a[mid] > a[0]) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return Integer.MAX_VALUE;
	}

}
