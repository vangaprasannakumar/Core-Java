package p12_1Collections_2Iterator_FM;

import java.util.Random;
import java.util.Vector;

public class C_5Vector {

	public static void main(String[] args) {
		//Vector<Integer>d = new Vector<Integer>();
		Vector<Integer> d = new Vector<Integer>();
		Random num = new Random();
		for(int i=1;i<=10;i++) {
			d.add(num.nextInt(200));
		}
	
		System.out.println("vector list\n"+d);
		
		d.set(5,78);
		System.out.println("\nvector list after set(5,78);\n"+d);
		
		System.out.println("\nget(8)		- "+d.get(8));
		System.out.println("\nsize()		- "+d.size());
		System.out.println("\nlastIndexOf(98)	- "+d.lastIndexOf(98));
		System.out.println("\ncontainsAll	- "+d.containsAll(d));
		System.out.println("\nvector contains	- "+d.contains(66));
		System.out.println("\nis empty	- "+d.isEmpty());
		System.out.println("\nremove is	- "+d.remove(5));
		
		d.clear();
		System.out.println("\nvector list After clear - "+d);
		System.out.println("\nAfter Clear size() - "+d.size());
	}
}
