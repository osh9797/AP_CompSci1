/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String newX = "";
		x = x.toLowerCase();
		String tempX="";
		for(int i =0; i<x.length();i++){
			if(i%2 ==0){
			tempX = x.substring(i,i+1).toUpperCase();
			}else{
				tempX = x.substring(i,i+1);
			
			}
			newX = newX +tempX;
		}
		System.out.println(newX);
		
		while(true){
			if(sentence.indexOf(" ") == -1)
			break;
		}
		int space = sentence.indexOf(" ");
		String word = sentence.substring(0,space);
		sentence = sentence.substring(space + 1);
		
	}
	
	public static String spongeCase(String x){
		String newX = "";
		x = x.toLowerCase();
		String tempX="";
		for(int i =0; i<x.length();i++){
			if(i%2 ==0){
			tempX = x.substring(i,i+1).toUpperCase();
			}else{
				tempX = x.substring(i,i+1);
			
			}
			newX = newX +tempX;
		}
		return newX;
		
	},
	}
}
