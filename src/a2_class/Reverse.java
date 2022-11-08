package a2_class;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
//		int n = sc.nextInt();
		int rev=0,rem;
		
//		while(n>0)
//		{
//			rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		System.out.println("Revars = "+rev);
		
//		do {
//			rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		while(n>0);
//		System.out.println("Revars = "+rev);
		
	    for (int n = sc.nextInt();n>0;n--) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
	     } 
	}
}
