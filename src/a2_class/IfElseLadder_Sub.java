package a2_class;

import java.util.Scanner;

public class IfElseLadder_Sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 subjects marks");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();
		
		int sum =a+b+c+d+e+f;
			System.out.println("Sum = "+sum);
		int avg = sum/6;
			System.out.println("Avg = "+avg);
			
		if(avg>=75)
			System.out.println("A grade");
		else if(avg>=65 && avg <75)
			System.out.println("B grade");
		else if(avg>=45 && avg <65)
			System.out.println("c grade");
		else
			System.out.println("Fail");
		
	}

}
