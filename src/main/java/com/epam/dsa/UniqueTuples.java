package com.epam.dsa;

import java.util.HashSet;

public class UniqueTuples {

	public static void main(String[] args) {
		
		System.out.println(uniqueTuples("abbccde", 2));
	}
	
	private static HashSet<String> uniqueTuples(String input, int len) {
		
		HashSet<String> result = new HashSet<>();
		String temp;
		for(int i = 0; i < input.length() - len + 1; i++) {
			temp = input.substring(i, i + len);
			result.add(temp);
		}
		
		return result;
	}

}
