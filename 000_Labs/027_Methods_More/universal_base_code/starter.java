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
		basicRole character = new basicRole();
		character.setRole("warrior");
		character.setStrength(20);
		character.setDexterity(14);
		character.setIntelligence(3);
		character.setCharisma(9);
		System.out.println(character);

		
	}
}
