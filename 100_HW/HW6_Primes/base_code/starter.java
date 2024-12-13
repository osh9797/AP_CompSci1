/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int num){
		int checker = 2;
			while(checker < num){
				if((num % checker) == 0){
					return false;
				}
				checker = checker + 1;
			}
			return true;
	}public static void printPrimes(int maxnum){
		int counter = 2;
		while (counter < maxnum){
			if(checkPrime(counter)){
				System.out.println(counter);
			}
			counter = counter + 1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please write a num: ");
		int answer = sc.nextInt();
		sc.nextLine();
		printPrimes(answer);
		
	}
}
