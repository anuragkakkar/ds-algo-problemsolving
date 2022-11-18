package com.epam.dsa;

public class Pangram {

	public static void main(String[] args) {
		
		String input = "The quick brown fox jumps over the lazy dog";
		System.out.println(findMissingLetters(input));
		
		input = "The slow purple oryx meanders past the quiescent canine";
		System.out.println(findMissingLetters(input));
		
	}
	
	private static String findMissingLetters(String input) {
		
		int[] alphabets = new int[26];
		
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) { 
			if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				alphabets[(int)(input.charAt(i) - 'a')] = 1;
			}
        }
		
		String result = "";
		for(int i = 0; i < 26; i++) {
			if(alphabets[i] == 0) {
				result += (char) (i + 'a');
			}
		}
		
		return result;
		
		
	}

}
