/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf dwarf1 = new PooleDwarf(randName(),10);
		PooleDwarf dwarf2 = new PooleDwarf(randName(),11);
		PooleDwarf dwarf3 = new PooleDwarf(randName(),12);
		PooleDwarf dwarf4 = new PooleDwarf(randName(),13);
		PooleDwarf dwarf5 = new PooleDwarf(randName(),14);
		PooleDwarf dwarf6 = new PooleDwarf(randName(),15);
		PooleDwarf dwarf7 = new PooleDwarf(randName(),16);
		if(dwarf1.getName() == dwarf2.getName()){
			System.out.println("dwarf1 and dwarf2 have the same name: " + dwarf1.getName());
		}
		if(dwarf1.getName() == dwarf3.getName()){
			System.out.println("dwarf1 and dwarf3 have the same name: " + dwarf1.getName());
		}
		if(dwarf1.getName() == dwarf4.getName()){
			System.out.println("dwarf1 and dwarf4 have the same name: " + dwarf1.getName());
		}
		if(dwarf1.getName() == dwarf5.getName()){
			System.out.println("dwarf1 and dwarf5 have the same name: " + dwarf1.getName());
		}
		if(dwarf1.getName() == dwarf6.getName()){
			System.out.println("dwarf1 and dwarf6 have the same name: " + dwarf1.getName());
		}
		if(dwarf1.getName() == dwarf7.getName()){
			System.out.println("dwarf1 and dwarf7 have the same name: " + dwarf1.getName());
		}
	}
}
