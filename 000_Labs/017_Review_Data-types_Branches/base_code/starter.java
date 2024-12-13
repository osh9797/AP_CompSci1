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
		int points = 20;
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
		System.out.println("What would you liek your characters name to be?");
		String name = sc.nextLine();
		System.out.println("You have 20 points to spend in either Strength, Dexterity, Charisma, or Agility. You can have a max of 10 points in each trait.");
		int str = 0;
		
		if(points > 0){
		System.out.println("How many points would you like to put in strength?");
		str = sc.nextInt();
		sc.nextLine();
		points = points - str;
		if(str > 10){
			System.out.println("You cant add that many points");
			points = points + str;
			str = 0;
		
		System.out.println("How many points would you like in strength?");
		str = sc.nextInt();
		points = points - str;
		}
		System.out.println("You have " + points + " points left.");
		}
		
		
		int dex = 0;
		if(points > 0){
		System.out.println("How many points would you like to put in dexterity?");
		dex = sc.nextInt();
		sc.nextLine();
		points = points - dex;
		if(dex > 10){
			System.out.println("You cant add that many points");
			points = points + dex;
			dex = 0;
		
		System.out.println("How many points would you like in dexterity?");
		dex = sc.nextInt();
		points = points - dex;
		}
		System.out.println("You have " + points + " points left.");
		}
		int agl = 0;
		if(points > 0){
		System.out.println("How many points would you like to put in agility?");
		agl = sc.nextInt();
		sc.nextLine();
		points = points - agl;
		if(agl > 10 || points <=0){
			System.out.println("You cant add that many points");
			points = points + agl;
			agl = 0;
		
		System.out.println("How many points would you like in agility?");
		agl = sc.nextInt();
		points = points - agl;
		}
		System.out.println("You have " + points + " points left.");
		}
		int chm = 0;
		if(points > 0){
		System.out.println("How many points would you like to put in charisma?");
		chm = sc.nextInt();
		sc.nextLine();
		points = points - chm;
		if(chm > 10 || points<=0){
			System.out.println("You cant add that many points");
			points = points + chm;
			chm = 0;
		
		System.out.println("How many points would you like in charisma?");
		chm = sc.nextInt();
		points = points - chm;
		}
		System.out.println("You have " + points + " points left.");
		}
		System.out.println("Your characters name is " + name + ". There title is " + answer + ". Your stats are: ");
		System.out.println("Strength: " + str);
		System.out.println("Dexterity: " + dex);
		System.out.println("Agility: " + agl);
		System.out.println("Charisma: " + chm);

	}
}
