package exception;

import java.util.Scanner;

public class Userdefined {
	private static int age;
	
	static void validate() throws Age{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		age=sc.nextInt();
		
		if(age<18)
		{
			throw new Age("Invalid age. You are not allowed to watch this movie.");
		}
		else
		{
			System.out.println("You are eligible to watch this movie..");
		}
	}

}
