package com.epam.dsa;

public class RunLengthEncoding {

	public static void main(String[] args) {
		
		String input = "a";
		System.out.println(runRunLengthEncoding(input));
		
		input = "aa";
		System.out.println(runRunLengthEncoding(input));
		
		input = "aabbb";
		System.out.println(runRunLengthEncoding(input));
		
		input = "aabbbaa";
		System.out.println(runRunLengthEncoding(input));
		
		input = "aaabbbaad";
		System.out.println(runRunLengthEncoding(input));

	}
	
	private static String runRunLengthEncoding(String input) {
		
		String result = "";
		
		for(int i = 0; i < input.length(); i++) {
			
			char c = input.charAt(i);
			int count = 1;
			
			if((i + 1) >= input.length()) {
				result = result + c + count;
			}
			
			for(int j = i + 1; j < input.length(); j++) {
				
				if(c == input.charAt(j)) {
					count++;
				}
				else {
					result = result + c + count;
					i = j - 1;
					break;
				}
				
				if(j == input.length() - 1) {
					result = result + c + count;
					i = input.length();
				}
			}
		}
		return result;
	}

}
