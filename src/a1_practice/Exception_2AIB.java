package a1_practice;

import java.util.Scanner;

public class Exception_2AIB {

	public static void main(String[] args) {
		int []a = {5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter The Array Index Number");
			int i = sc.nextInt();
			System.out.println(a[i]);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}