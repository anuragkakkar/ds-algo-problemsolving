package com.epam.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApacheLogPattern {

	public static void main(String[] args) {
		
		String[] lines = new String[] {
			"10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0 \" 200 234",
			"10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0 \" 200 234", 
			"10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0 \" 200 234" 
			};
		System.out.println(findTopIPAddress(lines));
		
		lines = new String[] {
				"10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0 \" 200 234",
				"10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0 \" 200 234", 
				"10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0 \" 200 234",
				"10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0 \" 200 234",
				"10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0 \" 200 234"
				};
		System.out.println(findTopIPAddress(lines));
		
	}
	
	private static String findTopIPAddress(String[] lines) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		int maxAccess = 0;
		for(int i = 0; i < lines.length; i++) {
			
			String line = lines[i];
			String validDigits = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
			String regex = validDigits + "\\." + validDigits + "\\." + validDigits + "\\." + validDigits;
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(line);
			
			if(matcher.find()) {
				
				if(map.containsKey(matcher.group())) {
					map.put(matcher.group(), map.get(matcher.group()) + 1);
				}
				else {
					map.put(matcher.group(), 1);
				}
				maxAccess = Math.max(maxAccess, map.get(matcher.group()));
			}
		}
		
		String result = "";
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == maxAccess) {
				result = result + entry.getKey() + ",";
			}
		}
		return result.substring(0, result.length() - 1);
	}

}
