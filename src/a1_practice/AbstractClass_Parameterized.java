package a1_practice;
//Topic :- Parameterized constructor  Constructor in Abstract Class
import java.util.Scanner;

abstract class Numbers{
	int num1; int num2;
	Numbers(int num1,int num2){
	}
	abstract void note();
	void print() {
		System.out.println("-------");
	}
}
class Add extends Numbers{
	Add(int num1,int num2) {
		super(num1,num2);
		System.out.println("Addition = "+(num1+num2));
	}
	void note() {
		System.out.println("Addition");
	}
}
class Multiplication extends Numbers{
	Multiplication(int num1,int num2){
		super(num1,num2);
		System.out.println("Multiplication = "+(num1*num2));
	}
	
	void note() {
		System.out.println("Multiplication");
	}
}
public class AbstractClass_Parameterized {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Numbers n;
		System.out.println("Enter 2 numbers");
		n = new Add (input.nextInt(), input.nextInt());
		n.note();
		n.print();
		System.out.println("Enter 2 numbers");
		n = new Multiplication (input.nextInt(), input.nextInt());
		n.note();
		n.print();
	}
}