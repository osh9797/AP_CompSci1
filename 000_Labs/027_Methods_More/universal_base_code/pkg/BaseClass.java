/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public basicRole(){
		role = "No Role";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public basicRole(String a,int b, int c, int d, int e){
		role = a;
		strength = b;
		dexterity = c;
		intelligence = d;
		charisma = e;
	}

	public String setRole(role) {
		if(role.equals("warrior") || role.equals("Warrior")){
			return role = "Warrior";
		}else if(role.equals("wizard") || role.equals("Wizard")){
			return role = "Wizard";
		}else if(role.equals("rogue") || role.equals("Rogue")){
			return role = "Rogue";
		}
	}
	public int setStrength(strength){
		if(strength >= 0){
			strength = strength;
		}else{
			return strength = 0;
		}
	}
		public int setDexterity(dexterity){
		if(dexterity >= 0){
			dexterity = dexterity;
		}else{
			return dexterity = 0;
		}
	}
		public int setIntelligence(intelligence){
		if(intelligence >= 0){
			intelligence = intelligence;
		}else{
			return intelligence = 0;
		}
	}
		public int setCharisma(charisma){
		if(charisma >= 0){
			charisma = charisma;
		}else{
			return charisma = 0;
		}
	}
	public boolean setAll(role,strength,dexterity,intelligence,charisma){
		if(strength >= 0 && dexterity >= 0 && intelligence >= 0 && charisma >= 0 && (role.equals("Warrior") || role.equals("warrior") role.equals("wizard") || role.equals("Wizard") || role.equals("rogue") || role.equals("Rogue"))){
			return true;
		}else{
			return false;
		}
	}

}

