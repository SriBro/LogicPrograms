package prime;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = scanner.nextInt();
		int temp = num;
		int r,sum=0;
		while(num>0) {
			 r = num%10;
			 sum = (sum*10)+r;
			 num=num/10;
		}
		if(temp==sum)
			System.out.println(temp+" is a palindrome number");
		else
			System.out.println(temp+" is not a palindrome number");
	}	
		
}
