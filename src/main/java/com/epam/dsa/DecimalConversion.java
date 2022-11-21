package com.epam.dsa;

import java.util.HashMap;

public class DecimalConversion {

	public static void main(String[] args) {

		System.out.println(toDecimal(1L, 2L));
		
		System.out.println(toDecimal(1L, 3L));
		
		System.out.println(toDecimal(1L, 30L));
		
		System.out.println(toDecimal(1L, 75L));
		
		System.out.println(toDecimal(1L, 7L));

	}
	
	private static String toDecimal(Long numerator, Long denominator)
    {
        if (numerator == 0) return "0";
        
        String result = "";
 
        long quotient = numerator / denominator;
        long remainder = numerator % denominator * 10;
 
        result = result + String.valueOf(quotient);
        
        if (remainder == 0) return result;
                
        result = result + ".";
        HashMap<Long, Integer> map = new HashMap<>(); 
        
        while (remainder != 0) {
 
            if (map.containsKey(remainder)) {
            	
            	int index = map.get(remainder);
                String nonCyclicPart = result.substring(0, index);
                String cyclicPart = "(" + result.substring(index, result.length()) + ")";
                return nonCyclicPart + cyclicPart;
            }
 
            map.put(remainder, result.length());
            
            quotient = remainder / denominator;
            result = result + String.valueOf(quotient);
            
            remainder = (remainder % denominator) * 10;
        }
        
        return result;
    }

}
