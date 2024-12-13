/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a number");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please write another number");
		int y = sc.nextInt();
		sc.nextLine();
		if(x != y){
			System.out.println("These 2 numbers are not equal");
		}
		if(x==y){
			System.out.println("These 2 numbers are equal");
		}
		
		
		
	}
}
