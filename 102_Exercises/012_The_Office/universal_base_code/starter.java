/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee andre = new Employee(9504, "Andre", "Sookazian", 1.50);
		jim.raiseSalary(6);
		pam.raiseSalary(3);
		dwight.raiseSalary(1);
		andre.raiseSalary(50);
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		andre.employeeToString();
		double dre = andre.getAnnualSalary();
		double ji = jim.getAnnualSalary();
		double pa = pam.getAnnualSalary();
		double dw = dwight.getAnnualSalary();
		double mic = michael.getAnnualSalary();
		System.out.println("Andre annual salary: " + dre);
		System.out.println("Jim annual salary: " + ji);
		System.out.println("Pam annual salary: " + pa);
		System.out.println("Dwight annual salary: " + dw);
		System.out.println("Michael annual salary: " + mic);


		
	}
}
