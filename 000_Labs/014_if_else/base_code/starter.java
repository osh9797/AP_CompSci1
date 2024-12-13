/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int num = 111;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number form 1 to 1000");
		int guess = sc.nextInt();
		sc.nextLine();
		if(guess == num){
			System.out.println("You are correct!");
		}
		else if(guess != num){
			System.out.println("You are wrong");
		}
		
		
		
		
	}
}
