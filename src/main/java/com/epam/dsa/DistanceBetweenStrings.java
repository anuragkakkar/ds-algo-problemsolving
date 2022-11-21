package com.epam.dsa;

public class DistanceBetweenStrings {

	public static void main(String[] args) {
		
		String document = "In publishing and graphic design, "
				+ "lorem ipsum is a filler text commonly used to demonstrate the graphic elements";
		System.out.println(shortestDistance(document, "is", "a"));

	}
	
	private static double shortestDistance(String document, String word1, String word2) {
		
        String[] words = document.split("[, ]");

        int totalCharsBeforeWord = 0;
        double word1Count = 0, word2Count = 0, shortestDistance = Double.MAX_VALUE;
        for (String word : words) {
        	
            if (word.equalsIgnoreCase(word1)) {
            	word1Count = totalCharsBeforeWord + (word.length() / 2d);
            }
            else if (word.equalsIgnoreCase(word2)) {
            	word2Count = totalCharsBeforeWord + (word.length() / 2d);
            }

            if (word1Count > 0 && word2Count > 0) {
                shortestDistance = Math.min(shortestDistance, Math.abs(word2Count - word1Count));
            }

            totalCharsBeforeWord += word.length() + 1;
        }
        
        return shortestDistance;
    }

}
