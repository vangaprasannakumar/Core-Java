package a2_class;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		int pn=0,rem,a=n;
		
		while(n>0)
		{
			rem=n%10;
			pn=(pn*10)+rem;
			n=n/10;
		}
		if(pn==a)
			System.out.println(a+" is an Palindrome Number ");
		else
			System.out.println(a+" is Not an Palindrome Number ");
	}

}
