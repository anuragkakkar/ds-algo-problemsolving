package com.epam.dsa;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

	public static void main(String[] args) {
		
		int input = 6;
		int[] output = primeFactorization(input);
		for(int i : output) {
			System.out.print(i + " ");
		}
		
	}
	
	private static int[] primeFactorization(int x) {
		
		List<Integer> factors = new ArrayList<>();
		
		int divisor = 2;
		while(x > 1) {
			if(x % divisor == 0) {
				factors.add(divisor);
				x = x / divisor;
			}
			else {
				divisor++;
			}
		}
		
		int[] result = new int[factors.size()];
		for(int i = 0; i < factors.size(); i++) {
			result[i] = factors.get(i);
		}
		
		return result;
	}

}
