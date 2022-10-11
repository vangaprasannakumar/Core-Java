package a1_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_6IME {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your Contact number");
		try {
			int ContactNumar = input.nextInt();
		}catch (InputMismatchException e) {
			System.out.println(e.toString());
		}
	}

}