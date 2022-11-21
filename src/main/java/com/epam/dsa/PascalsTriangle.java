package com.epam.dsa;

public class PascalsTriangle {

	public static void main(String[] args) {
		
//		System.out.println(pascal(0, 6) + " " + pascal(1, 6) + " " + pascal(2, 6) + " " + 
//				pascal(3, 6) + " " + pascal(4, 6) + " " + pascal(5, 6) + " " + pascal(6, 6));
		
		System.out.println(pascal(0, 0));
		System.out.println(pascal(1, 2));
		System.out.println(pascal(4, 8));
		
	}
	
	private static int pascal(int col, int row) {
		
		int n = getFactorial(row);
		int r = getFactorial(col);
		int nMinusr = getFactorial(row - col);
		
		int nCr = n / (nMinusr * r);
		
		return nCr;
	}
	
	private static int getFactorial(int num) {
		
		if(num <= 1) return 1;
		return num * getFactorial(num - 1);
	}
}
