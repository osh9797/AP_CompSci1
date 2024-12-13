/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;
import java.util.Random;

class starter {
		public static int pow(int a, int b){
	int counter = 0;
	int newnum = 1;

	if(b == 0){
		return 1;
	}
	else{
		
		while(counter < b){
		
		newnum = newnum * a;
	
		counter = counter + 1;
		}
		return newnum;
		
		}
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();
		sc.nextLine();
		
	System.out.println(pow(num1,num2));


		
	}
}
