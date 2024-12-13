/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        int num1 = sc.nextInt();
        sc.nextLine();
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of these numbers is " + (num1 + num2));
        String food = sc.nextLine();
        System.out.println("Your fave food is " + food);
	}
}