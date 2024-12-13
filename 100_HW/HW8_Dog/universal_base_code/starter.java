/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog dog1 = new Dog("Goatedonkeyboard");
		dog1.setAge(18);
		Dog dog2 = new Dog("Andre", "Soos");
		if(dog1.isSleeping()){
			System.out.println(dog1.getName() + " is asleep");
		}
		else{
			dog1.bark();
			if(!dog2.isSleeping()){
				dog2.bark();
			}
		}



	}
}
