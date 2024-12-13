package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String name){
		name = name;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String name, String breed){
		age = 1;
	}
	public Dog(String name, int age){
		breed = "dog dog";
	}
	public void setName(String name){
		name = name;
	}
	public void setAge(int age){
		age = age;
	}
	public void setBreed(String breed){
		breed = breed;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		Random rand = new Random();
		return rand.nextBoolean();
	}
	public void bark(){
		System.out.println(name + "barks.");
	}

}
