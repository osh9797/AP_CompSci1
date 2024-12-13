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
		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();
		sc.nextLine();
		int num3 = sc.nextInt();
		sc.nextLine();
		if(num1 > num2 && num1 > num3){
			System.out.println(num1 + " is the biggest number");
		}
		if(num2 > num1 && num2 > num3){
			System.out.println(num2 + " is the biggest number");
		}
		if(num3 > num2 && num3 > num1){
			System.out.println(num3 + " is the biggest number");
		}
		if(num1 < num2 && num1 < num3){
			System.out.println(num1 + " is the smallest number");
		}
		if(num2 < num1 && num2 < num3){
			System.out.println(num2 + " is the smallest number");
		}
		if(num3 < num2 && num3 < num1){
			System.out.println(num3 + " is the smallest number");
		}
		
	}
}
