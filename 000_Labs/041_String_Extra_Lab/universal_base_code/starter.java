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
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String newX = "";
		String newWord = "";
		while(true){
			if(x.indexOf(" ") == -1){
				x = x + " " + newWord;
				break;
			}
			
			int space = x.indexOf(" ");
			newX = x.substring(0,space);
			x = x.substring(space+1);
			newWord= newX + " " + newWord;
		}
		System.out.println(x);


		
	}
}
