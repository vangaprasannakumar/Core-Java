package p03_Mtypes_MOL;
import java.util.Scanner;

class Sum{
	void add( int x , float y ) {
		System.out.println ("sum of 2 numbers = "+(x+y));
	}
	void add( float x , int y ) {
		System.out.println ("sum of 2 numbers = "+(x+y));
	}
}
public class MethodOverloading_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();
		
		System.out.println("Enter two values");
		s.add(sc.nextInt(), sc.nextFloat());
		
		System.out.println("Enter two values");
		s.add(sc.nextFloat(), sc.nextInt());
	}
}
