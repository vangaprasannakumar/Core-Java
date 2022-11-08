package a2_class;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int sum=0,rem,a=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem*rem);
			n=n/10;
		}
		if(sum==a)
			System.out.println(a+" is an Armstrong Number ");
		else
			System.out.println(a+" is Not an Armstrong Number ");
	}

}
