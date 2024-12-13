/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a number: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.println("Please write a number (bigger than the first number) : ");
		int y = sc.nextInt();
		sc.nextLine();
		int z = (int)(Math.random() * (y-x))+x;
		System.out.println("Your range is from " + x + " to " + y);
		System.out.println("Here are 5 random numbers: ");
		System.out.println(z);
		int g = (int)(Math.random() * (y-x))+x;
		System.out.println(g);
		int h = (int)(Math.random() * (y-x))+x;
		System.out.println(h);
		int v = (int)(Math.random() * (y-x))+x;
		System.out.println(v);
		int j = (int)(Math.random() * (y-x))+x;
		System.out.println(j);

		
		
	}
}
