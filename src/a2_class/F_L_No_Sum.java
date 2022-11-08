package a2_class;

import java.util.Scanner;

public class F_L_No_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int i = sc.nextInt();
		int d=0,q=0;
		q=i%10;
		d=i;
		while(d>=10){
			d=d/10;
		}
		System.out.println("Sum of first and last digit: "+(d+q));
	}
}
