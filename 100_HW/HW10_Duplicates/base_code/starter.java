/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int dupe = (int)(Math.random()*11);
		int dupes = 0;
		System.out.println("The random number is " + dupe);
			int [] numbers = new int[20];
		for(int c = 0; c < numbers.length; c++){
			numbers[c] = (int)(Math.random()*11);
			System.out.println(numbers[c]);
		}
		for(int c = 0; c <numbers.length-1; c++){
			if(numbers[c] == dupe){
				dupes = dupes + 1;
				
			}
		
		}
		if(dupes == 0){
			System.out.println("There are no duplicate numbers");
		}else if(dupes == 1){
			System.out.println("There is 1 duplicate");
		}else if (dupes > 1){
			System.out.println("There are " + dupes + " duplicates");
		}
		int minus = 20;
		for(int c2 = 0; c2<numbers.length-1; c2++){
			if(numbers[c2] == numbers[c2 + 1]){
				System.out.println("At index " + (20-minus) + " and at index " + (20-(minus-1)) + " are consecutive");
			
			}
			minus = minus - 1;

		}
	
	
			
	}
}
