package com.epam.dsa;

public class StudentElectionProgram {

	public static void main(String[] args) {
		
		System.out.println(whoIsElected(1, 1));
		
		System.out.println(whoIsElected(2, 2));
		
		System.out.println(whoIsElected(4, 2));
		
		System.out.println(whoIsElected(5, 2));
		
		System.out.println(whoIsElected(7, 3));
		
		System.out.println(whoIsElected(10, 3));
		
	}

	private static int whoIsElected(int numberOfStudents, int songLength) {
		
		if(numberOfStudents == 1) return 1;
		
		return (whoIsElected(numberOfStudents - 1, songLength) + songLength - 1) 
				% numberOfStudents + 1;
		
	}
}
