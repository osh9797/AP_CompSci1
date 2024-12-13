/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	
	public myCharacter(){
		role = "No Role";
	
	
	}
	
	public String myCharacter(String a) {
		role = a;
		if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("A sneaky person arent you? You have chosen to join the Rogue class!");
			
			return role;
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("All bronze no brains! You have chosen to join the Warrior class!");
			
			return role;
		}
		else if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("Magic and potions are to your liking I see. You have chosen to join the Wizard class!");
			
			return role;
		}
		else{
			System.out.println("That is not a valid role.");
			
			return role;
		}
		
		
	}

}

