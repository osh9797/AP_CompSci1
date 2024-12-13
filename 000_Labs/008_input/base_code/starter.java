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
		String name;
		int age;
		int day;
		int year;
		double money;
		
		System.out.println("What is your name");
		name = sc.nextLine();
		System.out.println("What is your age?");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("What month are you born in?");
		String month = sc.nextLine();
		
		
		System.out.println("What date of the month are you born?");
		day = sc.nextInt();
		System.out.println("What year are you born in?");
		year = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		money = sc.nextDouble();
		System.out.println("Your name is " + name);
		System.out.println("Your are " + age + " years old.");
		System.out.println("You are born in " + month);
		System.out.println("You are born on" + month + " " + day);
		System.out.println("The year you are born in is " + year);
		System.out.println("A buck fifty is " + money);
		
		
		
		
	}
}
