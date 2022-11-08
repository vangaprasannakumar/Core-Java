package a2_class;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int sum=0,rem;
		
//		while(n>0)
//		{
//			rem=n%10;
//			sum=sum+rem;
//			n=n/10;
//		}
//		System.out.println("sum = "+sum);
		
		do {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		while(n>0);
		System.out.println("sum = "+sum);

	}
}
