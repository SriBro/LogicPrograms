package prime;
import java.util.Scanner;

public class Factorial_Recursion {
	public int fact(int num) {
		if(num==1)
			return 1;
		else {
			return num*fact(num-1);
		}
	}
	public static void main(String[] args) {
		Factorial_Recursion factorial_Recursion = new Factorial_Recursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("The factorial of "+number+" is "+factorial_Recursion.fact(number));
		
	}
}
