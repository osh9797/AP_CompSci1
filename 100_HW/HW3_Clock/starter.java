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
		System.out.println("What day is it? Type 0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday.");
		int day = sc.nextInt();
		sc.nextLine();
		if (day == 0){
			System.out.println("Today is Sunday. Your alarm is set for 10:00 AM.");
		}
		else if(day == 1){
			System.out.println("Today is Monday. Your alarm is set for 7:00 AM.");
		}
		else if(day == 2){
			System.out.println("Today is Tuesday. Your alarm is set for 7:00 AM.");
		}
		else if(day == 3){
			System.out.println("Today is Wedensday. Your alarm is set for 7:00 AM.");
		}
		else if(day == 4){
			System.out.println("Today is Thursday. Your alarm is set for 7:00 AM.");
		}
		else if(day == 5){
			System.out.println("Today is Friday. Your alarm is set for 7:00 AM.");
		}
		else if(day == 6){
			System.out.println("Today is Saturday. Your alarm is set for 10:00 AM.");
		}
	}
}
