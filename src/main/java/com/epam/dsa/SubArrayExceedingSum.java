package com.epam.dsa;

public class SubArrayExceedingSum {

	public static void main(String[] args) {
		
		int[] array1 = new int[] {1, 2, 3, 4};
		System.out.println(subArrayExceedsSum(array1, 6));
		
		array1 = new int[] {1, 2, 3, 4};
		System.out.println(subArrayExceedsSum(array1, 12));

	}
	
	private static int subArrayExceedsSum(int[] array1, int target) {
		
		int sum = 0;
        int minLength = array1.length + 1;
        int left = 0, right = 0;

        while (right < array1.length) {
        	
            while (sum <= target && right < array1.length) {
            	sum += array1[right++];
            }
            
            while (sum > target && left < array1.length) {
            	
                if ((right - left) < minLength) {
                	minLength = right - left;
                }

                sum -= array1[left++];
            }
        }
        
        return minLength > array1.length ? -1 : minLength;
	}

}
