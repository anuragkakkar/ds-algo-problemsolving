package com.epam.dsa;

public class POW {

	public static void main(String[] args) {
		
		System.out.println(pow(2, 7));
		System.out.println(pow(2, 10));
		System.out.println(pow(-2, 10));
		System.out.println(pow(-2, 11));
		System.out.println(pow(2, -3));
		System.out.println(pow(-2, -3));

	}
	
	private static float pow(int a, int n) {
		
		if(n == 0) return 1;
		
		float temp = pow(a, n / 2);
		
		if(n % 2 == 0) {
			return temp * temp;
		}
		else {
			if(n > 0) {
				return temp * temp * a;
			}
			else {
				return temp * temp / a;
			}
		}
	}

}
