/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Please write a name");
	String name = sc.nextLine();
	System.out.println("How many times would you like to print this name out?");
	int answer = sc.nextInt();
	sc.nextLine();
	int counter = 1;
	while(counter <= answer){
		System.out.println(name);
		counter = counter + 1;
	}

		
	}
}
