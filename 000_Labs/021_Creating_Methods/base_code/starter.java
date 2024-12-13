/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
	int counter = 0;
	if(b == 0){
		return 1;
	}
	else{
		while(counter < b){
		a = a * a;
		}
		return a;
		}
		
	}
	public static void main(String args[]) {
System.out.println(pow(2,4));


		
	}
}
