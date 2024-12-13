/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior [] warriors = new Warrior[100];
		Wizard [] wizards = new Wizard[100];
		for(int i = 0; i<warriors.length; i++){
			warriors[i] = new Warrior("bobob");
		}
		for(int i = 0; i<wizards.length;i++){
			wizards[i] = new Wizard();
		}
		while(true){
			for(int i = 0; i<wizards.length && i<warriors.length; i++){
				attack(wizard[i]);
				attack(warrior[i]);
			}
		}

	}
}
