package com.epam.dsa;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "abcd";
		System.out.println(reverseString(input));
		
		input = "anuragkakkar";
		System.out.println(reverseString(input));

	}
	
	private static String reverseString(String input) {
		
		String result = "";
		
		for(int i = 0; i < input.length(); i++) {
			result = input.charAt(i) + result;
		}
		
		return result;
		
	}

}
