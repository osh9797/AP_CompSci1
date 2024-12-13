/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        greeting("monkey");
        double newSalary = raise(100000.62, 3);
        System.out.println(newSalary);
        newSalary = raise(newSalary, 6);
	}
	public static void printAnimal(){
	    System.out.println("          ,");
        System.out.println("  __)\\_  ");
        System.out.println(" (\\_.-'    a`-.");
        System.out.println("jgs  (/~~````(/~^^`");
	}
	public static void greeting(String name){
	    System.out.println("Barev " + name);
	}
	private static double raise(double salary, int percent){
	     double amount = salary + (salary*(percent/100.0));
	     return amount;
	}
	
	
	
}