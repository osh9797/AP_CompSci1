/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a word: ");
		String answer = sc.nextLine();
		int length = answer.length();
		for(int i = 0; i < length; i++){
			System.out.println(answer.substring(i,i+1));
		}


		
	}
}
