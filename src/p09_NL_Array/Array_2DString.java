package p09_NL_Array;

import java.util.Scanner;

public class Array_2DString {

	public static void main(String[] args) {
		String name[][] = new String[3][3];
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 9 Names");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				name[i][j] = input.next();
			}
		}
		for(int i= 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("name [ "+i+"] [ "+j+" ] = "+name[i][j]);
			}
		}
		System.out.println("");
	}
}