package prime;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int k,a,b;
		k=0;
		a=1;
		b=1;
		System.out.print("1 1"+" ");
		while(k<=num) {
			k=a+b;
			if(k>=num) 
			System.out.print(k+" ");
			a=b;
			b=k;
		}
	}
}
