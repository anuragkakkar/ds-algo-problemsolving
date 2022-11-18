package com.epam.dsa;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println(squareRoot(4));
		System.out.println(squareRoot(2));
		System.out.println(squareRoot(1));
		System.out.println(squareRoot(0));
	}
	
	private static double squareRoot(double x) {
		
		if(x == 0) return 0;
		
		int i = 1;
		while(i*i <= x) {
			if(i*i == x) return i;
			i++;
		}
		
		return squareRootdouble(x, i - 1, i);
		
	}

	private static double squareRootdouble(double x, double i, double j) {
		
		double mid = i + (j - i) / 2;
		
		double square = mid * mid;
		
		if(square == x || Math.abs(square - x) < 0.00001) 
			return mid;
		else if (square < x) 
			return squareRootdouble(x, mid, j);
		else
			return squareRootdouble(x, i, mid);
	}

}
