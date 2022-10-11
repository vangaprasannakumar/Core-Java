package p10_Exception;

import java.util.Scanner;

public class Exception_3SIOB {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		try {
			System.out.println(name.charAt(10));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}