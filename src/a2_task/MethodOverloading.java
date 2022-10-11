package a2_task;
import java.util.Scanner;
class Addition{
	void add( int x , int y ) {
		System.out.println ("Integer sum = "+(x+y));
	}
	void add( int x , int y , int z ) {
		System.out.println ("Integer sum = "+(x+y));
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Addition s = new Addition();
		System.out.println("Enter the values");
		s.add(sc.nextInt(), sc.nextInt());

		System.out.println("Enter the values");
		s.add(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
}
