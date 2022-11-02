package own;

import java.util.Scanner;

public class _2_PrimeNumberChecker {
	public static void main(String[] args) {

		System.out.println("Enter a number to check if it is a prime number:");
		
		int num = new Scanner(System.in).nextInt();
		boolean flag = false;
		
		for(int i = 2; i <= num/2; ++i){
		// condition for non-prime number
			if(num % i == 0){
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}
