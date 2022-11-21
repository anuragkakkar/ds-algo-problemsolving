package com.epam.dsa;

public class MedianTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] array1 = new int[] {1, 3};
		int[] array2 = new int[] {2, 4};
		System.out.println(findMedianOfSortedArrays(array1, array2));
		
		array1 = new int[] {1, 3};
		array2 = new int[] {2};
		System.out.println(findMedianOfSortedArrays(array1, array2));
			
		

	}
	
	private static double findMedianOfSortedArrays(int[] array1, int[] array2) {
		
		int[] totalArray = new int[(array1.length + array2.length) / 2 + 1];
		
		int i = 0, j = 0, k = 0;
		while(i < array1.length && j < array2.length && k < totalArray.length) {
			
			if(array1[i] < array2[j]) {
				totalArray[k] = array1[i];
				i++;
			}
			else {
				totalArray[k] = array2[j];
				j++;
			}
			k++;
		}
		
		while(i < array1.length && k < totalArray.length) {
			totalArray[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2.length && k < totalArray.length) {
			totalArray[k] = array2[j];
			j++;
			k++;
		}
		
		if((array1.length + array2.length) % 2 == 0) {
			return (double) (totalArray[totalArray.length - 1] + totalArray[totalArray.length - 2]) / 2;
		}
		else {
			return (double) totalArray[totalArray.length - 1];
		}
	}

}
