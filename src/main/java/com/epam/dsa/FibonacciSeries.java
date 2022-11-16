package com.epam.dsa;

import java.util.Scanner;

public class FibonacciSeries {

	private static long[] fibonacciCache;	
	public static void main(String[] args) {
		
		System.out.println("Input a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		fibonacciCache = new long[n + 1];
		
		System.out.println("\nFirst " + n + " numbers in fibonacci series are : ");
		for(int i = 0; i <= n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	private static long fibonacci(int n) {
		if(n <= 1) return n;
		
		if(fibonacciCache[n] != 0) return fibonacciCache[n];
		
		long nthFibonacciNumber = fibonacci(n - 1) + fibonacci(n - 2);
		
		fibonacciCache[n] = nthFibonacciNumber;
		
		return nthFibonacciNumber;
	}

}
