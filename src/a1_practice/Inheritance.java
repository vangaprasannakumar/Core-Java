package a1_practice;
import java.util.Scanner;

class Square {
    int a;
   Scanner sc = new Scanner ( System.in );
    void input() {
        System.out.println("Enter a value ");
        a = sc.nextInt();
   }
    void square() {
        System.out.println("Square = "+(a*a));
    }
}
class Addition extends Square {
    int b;
    void accept() {
        System.out.println("Enter b value");
        b = sc.nextInt();
    }
    void sum() {
        System.out.println("Sum = "+(a+b));
    }
}
public class Inheritance {

	public static void main(String[] args) {
		Addition aa = new Addition();
		aa.input();
		aa.square();
		aa.accept();
		aa.input();
		aa.sum();
	}
}
