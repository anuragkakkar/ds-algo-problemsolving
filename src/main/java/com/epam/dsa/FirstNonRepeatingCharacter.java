package com.epam.dsa;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String input = "apple";
		System.out.println(findFirstNonRepeatingCharacter(input));
		
		input = "racecars";
		System.out.println(findFirstNonRepeatingCharacter(input));
		
		input = "xxyyzz";
		System.out.println(findFirstNonRepeatingCharacter(input));

	}
	
	private static char findFirstNonRepeatingCharacter(String input) {
        
		int[] count = new int[26];
        
        for (int i = 0; i < input.length(); i++) {   
            count[(int)(input.charAt(i) - 'a')]++;
        }
        
        for (int i = 0; i < input.length(); i++) {
            if (count[(int)(input.charAt(i) - 'a')] == 1) {
                return input.charAt(i);
            }
                
        }
        return '0';
    }

}
