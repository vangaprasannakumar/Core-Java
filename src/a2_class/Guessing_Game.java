package a2_class;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		Random n=new Random();
		int r=n.nextInt(100);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Guess Number");
		int g=sc.nextInt();
		
//		while(g != r) {
//			if(g>r) {
//				System.out.println("Too High");
//				g=sc.nextInt();
//			}
//			else if(g<r) {
//				System.out.println("Too Low");
//				g=sc.nextInt();
//			}
//		}
		
		while(g != r) {
			r=n.nextInt(100);
			if(g>r) {
				System.out.println("Too High, R = "+r);
				g=sc.nextInt();
			}
			else if(g<r) {
				System.out.println("Too Low, R = "+r);
				g=sc.nextInt();
			}
		}
		
		System.out.println("Guess is Correct");
		System.out.println("The Random number is "+r);
	}
}
