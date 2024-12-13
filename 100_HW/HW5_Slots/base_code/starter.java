/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		System.out.println("You have 100 dollars to play slots. Good luck.");
		Scanner sc = new Scanner(System.in);
		int purse = 100;
		int answer;
		int rand1;
		int rand2;
		int rand3;
		while(purse > 0){
			System.out.println("Purse = " + purse);
			System.out.println("How much would u like to bet");
			answer = sc.nextInt();
			purse = purse - answer;
			rand1 = (int)(Math.random()*9)+1;
			rand2 = (int)(Math.random()*9)+1;
			rand3 = (int)(Math.random()*9)+1;
			System.out.println(rand1 + " " + rand2 + " " + rand3);
			if(rand1 == rand2 && rand1 == rand3){
				answer = answer * 3;
				purse = purse + answer;
				System.out.println("Wow u hit a 3 way jackpot");
				
			}
			else if(rand1 == rand2 || rand1 == rand3 || rand2 == rand3){
				answer = answer * 2;
				purse = purse + answer;
				System.out.println("You hit a 2 way jackpot, nice!");
			}
			else{
				System.out.println("Unlucky u didnt get the jackpot");
			
				
			}

			
		}
		System.out.println("Oh well you lost all your money, better luck next time.");
	}
}
