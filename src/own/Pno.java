package own;

import java.util.Scanner;

public class Pno {

	public static void main(String[] args) {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        for (i = 1; i <= n; i++){
            int counter=0;
            for(num =i; num>=1; num--){
                if(i%num==0){
                    counter = counter + 1;
                }
            }
            if (counter ==2){
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to "+ n+" are :");
        System.out.println(primeNumbers);
	}
}