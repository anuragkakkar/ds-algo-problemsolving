package com.epam.dsa;

public class LongestUniformSubstring {

	public static void main(String[] args) {
		
		String input = "abbbccda";
		int[] ans = longestUniformSubstring(input);
		System.out.println("{" + ans[0] + "," + ans[1] + "}");
		
		input = "aabbbbbCdAA";
		ans = longestUniformSubstring(input);
		System.out.println("{" + ans[0] + "," + ans[1] + "}");
		
		input = "TUOPPPPJHHTT";
		ans = longestUniformSubstring(input);
		System.out.println("{" + ans[0] + "," + ans[1] + "}");

	}
	
	private static int[] longestUniformSubstring(String input) {
		
		char c = input.charAt(0);
		int count = 0;
		int maxCount = 0;
		
		int sIndex = 0;
		int eIndex = 0;
		
		int startIndex = 0;
		int endIndex = 0;
		
		for(int i = 1; i < input.length(); i++) {
			
			if(input.charAt(i) == c) {
				count++;
			}
			else {
				c = input.charAt(i);
				count = 0;
				sIndex = i;
			}
			
			if(count > maxCount) {
				maxCount = count;
				eIndex = i;
				
				if((eIndex - sIndex) > (startIndex - endIndex)) {
					startIndex = sIndex;
					endIndex = eIndex;
				}
				
			}
			
		}
		
		return new int[] {startIndex, (endIndex - startIndex + 1)};
		
	}

}
