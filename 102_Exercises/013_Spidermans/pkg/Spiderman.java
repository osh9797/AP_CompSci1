package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public Spiderman(){
		actor = "unknown";
		age = 0;
		villian = "unknown";
	}
	public Spiderman(String a){
		actor = a;
		age = 0;
		villian = "unknown";
	}
	public Spiderman(int a){
		actor = "unknown";
		age = a;
		villian = "unknown";
	}
		public Spiderman(String act, int a){
		actor = act;
		age = a;
		villian = "unknown";
	}
		public Spiderman(String act , int a, String vil){
		actor = act;
		age = a;
		villian = vil;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setVillian(int villian){
		this.villian = villian;
	}
	public void setActor(int actor){
		this.actor = actor;
	}
	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillian(){
		return villian;
	}
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
