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
		BaseClass test = new BaseClass();
		double average = 0;
		int [] numbers = new int[201];
		for(int c = 0; c < numbers.length; c++){
			numbers[c] = (int)(Math.random()*101);
			System.out.println(numbers[c]);
		}
		int min = Integer.MAX_VALUE;
		for(int c1 = 0; c1 < numbers.length; c1++){
			if(numbers[c1] < min){
				min = numbers[c1];
			}
		}
		System.out.println("The minimum number is " + min);
			for(int c1 = 0; c1 < numbers.length; c1++){
			if(numbers[c1] > min){
				min = numbers[c1];
			}
		}
		System.out.println("The max number is " + min);
		for(int c2 = 0; c2 < numbers.length; c2++){
			average = average + numbers[c2];
		}
		double average_divider = numbers.length;
		System.out.println("The average of all the numbers is " + (average/average_divider));


		
	}
}
