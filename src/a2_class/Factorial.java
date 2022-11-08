package a2_class;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int f=1;
		
		while(n>=1)
		{
			f=f*n;
			n--;
		}
		System.out.println("Factorial = "+f);
	}
}