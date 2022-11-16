package com.epam.dsa;

public class PowerOfTen {

	public static void main(String[] args) {
		
		System.out.println(isPowerOf(3));
		System.out.println(isPowerOf(10));
		System.out.println(isPowerOf(20));
		System.out.println(isPowerOf(30));
		System.out.println(isPowerOf(50));
		System.out.println(isPowerOf(100));

	}
	
	private static boolean isPowerOf(int x) {
		
		return Math.log10(x) % 1 == 0;
	}

}
