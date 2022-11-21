package com.epam.dsa;

public class WalkingRobot {

	public static void main(String[] args) {
		
		String path = "";
		int[] result = walk(path);
		System.out.println("{" + result[0] + ", " + result[1] + "}");
		
		path = "L";
		result = walk(path);
		System.out.println("{" + result[0] + ", " + result[1] + "}");
		
		path = "UUU";
		result = walk(path);
		System.out.println("{" + result[0] + ", " + result[1] + "}");
		
		path = "ULDR";
		result = walk(path);
		System.out.println("{" + result[0] + ", " + result[1] + "}");
		
	}
	
	private static int[] walk(String path) {
		
		int x = 0, y = 0;
		for(int i = 0; i < path.length(); i++) {
			
			if(path.charAt(i) != 'U' && path.charAt(i) != 'D' && 
					path.charAt(i) != 'L' && path.charAt(i) != 'R') {
				continue;
			}
			
			if(path.charAt(i) == 'L') x--;
			else if(path.charAt(i) == 'R') x++;
			else if(path.charAt(i) == 'D') y--;
			else if(path.charAt(i) == 'U') y++;
			
		}
		
		return new int[] {x, y};
		
	}

}
