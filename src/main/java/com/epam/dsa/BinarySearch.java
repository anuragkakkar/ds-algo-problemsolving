package com.epam.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] input = new int[] {2, 5, 7, 11, 17, 25, 29};
		System.out.println(binarySearch(0, input.length - 1, input, 7));
		System.out.println(binarySearch(0, input.length - 1, input, 29));
		System.out.println(binarySearch(0, input.length - 1, input, 37));

	}
	
	private static int binarySearch(int left, int right, int[] input, int element) {
		
		if(input.length == 0) return -1;
		
		if(right >= left && left < input.length) {
			int mid = left + (right - left) / 2;
			
			if(element == input[mid]) {
				return mid;
			}
			else if(element < input[mid]) {
				return binarySearch(left, mid - 1, input, element);
			}
			else {
				return binarySearch(mid + 1, right, input, element);
			}
		}
		
		return -1;
	}

}
