package own;


import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args){
      int n, num, rem, sum = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter any 3 digits Positive Number : ");
      n = input.nextInt();
      num = n;
      while(num >= 1){
          rem = num % 10;
          sum = sum + (rem * rem * rem);
          num = num / 10;
      }
      if(sum == n)
          System.out.print(n+" is an Armstrong Number");
      else
          System.out.print(n+" not an Armstrong Number");
	}
}