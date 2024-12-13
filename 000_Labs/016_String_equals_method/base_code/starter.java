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
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Rogue, Wizard, or Warrior");
		String answer = sc.nextLine();
		if (answer.equals("rogue")){
			System.out.println("You have chosen to be a Rogue");
		}
		else if (answer.equals("Rogue")){
			System.out.println("You have chosen to be a Rogue");
		}
		else if (answer.equals("wizard")){
			System.out.println("You have chosen to be a Wizard");
		}
		else if (answer.equals("wizard")){
			System.out.println("You have chosen to be a Wizard");
		}
		else if (answer.equals("Warrior")){
			System.out.println("You have chosen to be a Warrior");
		}
		else if (answer.equals("warrior")){
			System.out.println("You have chosen to be a Warrior");
		}
		else{
			System.out.println("Thats not a valid answer.");
		}
		
	}
}
