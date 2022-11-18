package com.epam.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestWord {

	public static void main(String[] args) {
		
		List<String> dictionary = 
				Arrays.asList("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
		String letters = "oet";
		System.out.println(Arrays.asList(longestWord(dictionary, letters)));
		
		dictionary = 
				Arrays.asList("to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana");
		letters = "oetdg";
		System.out.println(Arrays.asList(longestWord(dictionary, letters)));
		
	}
	
	private static String[] longestWord(List<String> dictionary, String letters) {
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i = 0; i < letters.length(); i++) {
			set.add(letters.charAt(i));
		}
		
		List<String> result = new ArrayList<>();
		int longestWordlength = 0;
		for(int i = 0; i < dictionary.size(); i++) {
			
			String s = dictionary.get(i);
			boolean isAllPresent = true;
			for(int j = 0; j < s.length(); j++) {
				if(!set.contains(s.charAt(j))) {
					isAllPresent = false;
				}
			}
			
			if(isAllPresent) {
				if(longestWordlength < s.length()) {
					result.clear();
					result.add(s);
					longestWordlength = s.length();
				}
				else if(longestWordlength == s.length()) {
					result.add(s);
				}
			}
		}
		
		return result.toArray(new String[0]);
	}
}
