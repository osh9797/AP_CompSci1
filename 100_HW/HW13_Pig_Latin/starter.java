/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String answer = sc.nextLine();
        int space = answer.indexOf(" ");
        String Newword = "";
        
        while(true){
        	
        	if(space == -1){
        		 if(answer.substring(0,1).equals("a") || answer.substring(0,1).equals("e") || answer.substring(0,1).equals("o") || answer.substring(0,1).equals("u") || answer.substring(0,1).equals("i")){
        			Newword = Newword + answer + "-way ";
        		 }else{
        			Newword = Newword + answer.substring(1) + "-" + answer.substring(0,1) + "ay ";
        		 }
        		break;
        	}
        	
        	String tempword = answer.substring(0,space);
        	
        	
        if(answer.substring(0,1).equals("a") || answer.substring(0,1).equals("e") || answer.substring(0,1).equals("o") || answer.substring(0,1).equals("u") || answer.substring(0,1).equals("i")){
        	Newword = Newword + tempword + "-way ";
        	
        }else{
        	Newword = Newword + tempword.substring(1) + "-" + tempword.substring(0,1) + "ay ";
        
        }
        answer = answer.substring(space+1);
        space = answer.indexOf(" ");
        }
        System.out.println(Newword);
        
        
        
        
	}
}
