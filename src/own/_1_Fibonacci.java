package own;

import java.util.Scanner;

public class _1_Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the Fibonacci series: ");
        int length = scanner.nextInt();

        int[] series = new int[length];
        series[0] = 0;
        series[1] = 1;

        for(int i=2; i < length; i++) {
            series[i] = series[i-1] + series[i-2];
        }
        System.out.println("Fibonacci Series of "+length+" numbers:");
        for(int i=0; i < length; i++) {
            System.out.print(series[i] + " ");
        }
    }
}