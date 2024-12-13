/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int num = 111;
	int guess = 0;
	Scanner sc = new Scanner(System.in);
	while(guess != num){
		System.out.println("Please guess a number form 1-1000");
		guess = sc.nextInt();
		sc.nextLine();
		if(guess == num){
			break;
		}
		else{
			System.out.println("You are wrong. Please try again.");
		}
	}
	System.out.println("You guessed the correct number congrats!");


		
	}
}
