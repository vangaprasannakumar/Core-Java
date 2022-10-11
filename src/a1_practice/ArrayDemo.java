package a1_practice;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner input =new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter array elements");
			a [i] = input.nextInt();
		}
		int sum = 0; 
		for(int i=0;i<5;i++){
			sum = sum+a[i];
			System. out . println ( "a [ "+i+" ] = "+a[i]);
		}
		System.out.println("Sum = "+sum);
		
		for(int n=123,rem=0, x=0; n>0 ;rem=n%10, x=x+rem, n=n/10) {
				System.out.println ("Sum "+x);
		}
	}
}