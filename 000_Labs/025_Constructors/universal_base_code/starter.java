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
		System.out.println("You have no role currently. Please pick if you will join the Rogue, Warrior, or Wizard roles");
		myCharacter test = new myCharacter();
		Scanner sc = new Scanner(System.in);
		String character = sc.nextLine();
		System.out.println("You are now a " + test.myCharacter(character));


		
	}
}
