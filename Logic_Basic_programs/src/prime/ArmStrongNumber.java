package prime;
import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int temp=num;
		int r,sum=0;
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum + r*r*r; 
		}
		if(temp==sum) {
			System.out.println(temp+" is an armstrong number");
		}
		else {
			System.out.println(temp+" is not an armstrong number");
		}
	}
}
