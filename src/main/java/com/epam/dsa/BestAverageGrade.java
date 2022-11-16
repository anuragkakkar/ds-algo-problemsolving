package com.epam.dsa;

import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {

	public static void main(String[] args) {

		String[][] scores = 
			{{"Bobby", "87"}, {"Charles", "100"}, {"Eric", "64"}, {"Charles", "22"}};
		System.out.println(bestAverageGrade(scores));
		
		String[][] scores2 = 
			{{"Sarah", "91"}, {"Goldie", "92"}, {"Elaine", "93"}, 
					{"Elaine", "95"}, {"Goldie", "94"}, {"Sarah", "93"}};
		System.out.println(bestAverageGrade(scores2));
		
		String[][] scores3 = {};
		System.out.println(bestAverageGrade(scores3));
		
	}
	
	private static Integer bestAverageGrade(String[][] scores) {
		
		if(scores.length == 0) return 0;
		
		HashMap<String, Integer> studentToCount = new HashMap<>();
		HashMap<String, Integer> studentToTotal = new HashMap<>();
		
		for(int i = 0; i < scores.length; i++) {
			if(studentToCount.containsKey(scores[i][0])) {
				studentToCount.put(scores[i][0], studentToCount.get(scores[i][0]) + 1);
				studentToTotal.put(scores[i][0], studentToTotal.get(scores[i][0]) + Integer.parseInt(scores[i][1]));
			}
			else {
				studentToCount.put(scores[i][0], 1);
				studentToTotal.put(scores[i][0], Integer.parseInt(scores[i][1]));
			}
		}
		
		Integer bestAvg = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> entry : studentToTotal.entrySet()) {
			bestAvg = Math.max(bestAvg, entry.getValue() / studentToCount.get(entry.getKey()));
		}
		
		return bestAvg;
	}

}
