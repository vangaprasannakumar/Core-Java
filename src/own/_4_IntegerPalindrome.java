package own;

import java.util.Scanner;

public class _4_IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Integer to check if it is a palindrome");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int r = temp % 10;
            sum = (sum * 10) + r;
            temp = temp / 10;
        }
        if(n == sum){
            System.out.println(n + " is a palindrome");
        }
        else{
            System.out.println(n + " is not a palindrome");
        }
    }
}