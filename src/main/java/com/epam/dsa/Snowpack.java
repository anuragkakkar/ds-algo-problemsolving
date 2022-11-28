package com.epam.dsa;

public class Snowpack {
	
	public static void main(String[] args) {
		
		int[] a = {0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0};
		System.out.println("Snow trapped is " + calculateTrappedSnow(a) + " unit(s).");
		
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		System.out.println("Snow trapped is " + calculateTrappedSnow(b) + " unit(s).");
		
		int[] c = { 0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0 };
		System.out.println("Snow trapped is " + calculateTrappedSnowWithExtraSpace(c) + " unit(s).");

		int[] d = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		System.out.println("Snow trapped is " + calculateTrappedSnowWithExtraSpace(d) + " unit(s).");
	}

	private static int calculateTrappedSnow(int[] a) {
		int[] left = new int[a.length];
		left[0] = a[0];
		for(int i = 1; i < a.length; i++) {
			left[i] = Math.max(left[i - 1], a[i]);
		}
		
		int[] right = new int[a.length];
		right[a.length - 1] = a[a.length - 1];
		for(int i = a.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], a[i]);
		}
		
		int answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer += Math.min(left[i], right[i]) - a[i]; 
		}
		return answer;
	}
	
	//No Extra Space required.
	private static int calculateTrappedSnowWithExtraSpace(int[] a) {
		int trappedWater = 0;

		int left = 0;
		int right = a.length - 1;

		int maxLeft = a[0];
		int maxRight = a[a.length - 1];
		while (left < right) {

			if (a[left] < a[right]) {
				left++;
				maxLeft = Math.max(maxLeft, a[left]);
				trappedWater += maxLeft - a[left];
			} 
			else {
				right--;
				maxRight = Math.max(maxRight, a[right]);
				trappedWater += maxRight - a[right];
			}
		}
		return trappedWater;
	}
}
