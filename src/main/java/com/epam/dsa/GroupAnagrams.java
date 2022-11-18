package com.epam.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("eat","tea","tan","ate","nat","bat");
		System.out.println(groupAnagrams(words));
		
		words = Arrays.asList("cat", "dog", "god");
		System.out.println(groupAnagrams(words));
		
		words = Arrays.asList("");
		System.out.println(groupAnagrams(words));
		
		words = Arrays.asList("a");
		System.out.println(groupAnagrams(words));

	}
	
	private static Set<Set<String>> groupAnagrams(List<String> words) {
        HashMap<Integer, Set<String>> map = new HashMap<>();
        
        for(int i = 0; i < words.size(); i++) {
        	char[] temp = words.get(i).toCharArray();
        	Arrays.sort(temp);
            if(map.containsKey(String.valueOf(temp).hashCode())) {
            	Set<String> set = map.get(String.valueOf(temp).hashCode());
            	set.add(words.get(i));
            	map.put(String.valueOf(temp).hashCode(), set);
            }
            else {
            	Set<String> set = new HashSet<>();
            	set.add(words.get(i));
            	map.put(String.valueOf(temp).hashCode(), set);
            }
        }
        
        Set<Set<String>> ans = new HashSet<>();
        
        for(Map.Entry<Integer, Set<String>> entry : map.entrySet()) {
        	ans.add(entry.getValue());
        }
        
		return ans;
    }

}
