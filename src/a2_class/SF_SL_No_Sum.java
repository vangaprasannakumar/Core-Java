package a2_class;

import java.util.Scanner;

public class SF_SL_No_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int i = sc.nextInt();
		int sf=0,sl=0;
		sl=i%100;
		sl=sl/10;
		sf=i;
		while(sf>100){
			sf=sf/10;
		}
		sf=sf%10;
		System.out.println("Second First digit: "+sf);
		System.out.println("Second last digit: "+sl);
		
		System.out.println("Sum of Second First and Second last digits : "+(sf+sl));
	}

}
