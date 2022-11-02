package p06_Abstract_NestedClass;
import java.util.Scanner;
abstract class Area{
	double length, breadth;
	Scanner input = new Scanner(System.in);
	abstract void printArea();
	final void print() {
		System.out.println("To Calculate Area");
	}
}
class Rectangle extends Area {
	void printArea() {
		System.out.println("Enter Length and Breadth values in cm");
		length = input.nextDouble();
		breadth = input.nextDouble();
		System.out.println("Area of Rectangle = "+(length*breadth)+"cm²");
	}
}
class Triangle extends Area {
	void printArea() {
		System.out.println("Enter Height and Base values in cm");
		length = input.nextDouble();
		breadth = input.nextDouble();
		System.out.println("Area of Triangle = "+(length*breadth*0.5)+"cm²");
	}
}
public class Abstract_T {
	public static void main(String[] args) {
		Area a;
		a = new Rectangle();
		a.print();
		a.printArea();
		System.out.println("____________"+"\n");
		a = new Triangle();
		a.print();
		a.printArea();
	}
}