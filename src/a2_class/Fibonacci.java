package a2_class;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit to Print Fibonacci Series : ");
		int n = sc.nextInt();
		int a=0,b=1,f=0;
		while(a<=n)
		{
			f=a+b;
			System.out.print(a+" ");
			a=b;
			b=f;
		}
	}
}
