package own;

import java.util.Scanner;
public class N2W {
	public static void main(String[] args) {
		String[] words = {
				"zero","one","two","three","four","five","six","seven","eight","nine"
				,"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
				"eighteen","ninteen"
		};
		String[] tens = {
				"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"
		};	
		Scanner input = new Scanner(System.in);
		System.out.println("enter the only four digits number");
		int number = input.nextInt();		
		int quotent = (number<10)?number/10:(number>=100 && number<1000)?number/100:(number>=1000)?number/1000:0;
		int reminder = (number<100)?number%10:(number>=100 && number<1000)?number%100:(number>=1000)?number%1000:0;		
		if(number>=0&&number<100) {
			if(number<20) {
			System.out.println(words[number]);
			}
			else if(number>=20&&number<100&&reminder!=0){
			System.out.println(tens[quotent]+" "+words[reminder]);
			}
			else if(reminder == 0 && number>=20) {
			System.out.println(tens[quotent]);
			}
		}	
		else if(number>=100&&number<1000) {
			int q2 = reminder/10;
			int r2 = reminder%10;
			if(reminder == 0) {
				System.out.println(words[quotent]+" hundred ");
			}
			else if(reminder<20) {
				 System.out.println(words[quotent]+" hundred "+words[reminder]);
			}
			else if(reminder>20) {
				System.out.println(words[quotent]+" hundred "+tens[q2]+words[r2]);
			}
			else if(reminder>=20&&r2==0) {
				System.out.println(words[quotent]+" hundred "+tens[q2]);
			}
		}		
		else if(number>=1000&&number<10000) {
			int q2 = reminder/100,r2 = reminder%100;
			int q3 = r2/10,r3 = r2%10;
			int length = String.valueOf(reminder).length();
			if(reminder == 0) {
				System.out.println(words[quotent]+" thousand ");
			}
			else if(reminder<20&&length==2) {
				System.out.println(words[quotent]+" thousand "+words[reminder]);
			}
			else if(reminder>20&&length==2) {
				System.out.println(words[quotent]+" thousand "+tens[q3]+words[r3]);
			}
			else if(r2<20&&length==3) {
				System.out.println(words[quotent]+" thousand "+words[q2]+" hundred "+words[r2]);
			}
			else if(r2>20&&length==3) {
				System.out.println(words[quotent]+" thousand "+words[q2]+" hundred "+tens[q3]+words[r3]);
			}		
		}
		else {
			System.out.println("enter only four digits number");
		}
	}	
}