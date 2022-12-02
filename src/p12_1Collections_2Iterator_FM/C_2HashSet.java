package p12_1Collections_2Iterator_FM;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class C_2HashSet {

	public static void main(String[] args) {
		Set<Integer> sum = new HashSet<Integer>();

		sum.add(100);
		sum.add(200);
		sum.add(300);
		sum.add(400);
		sum.add(500);
		
		System.out.println("HashSet is	- "+sum);
		
		System.out.println("\n1. size()	- "+sum.size());
		
		System.out.println("\n2. isEmpty()	- "+sum.isEmpty());
		
		System.out.println("\n3. contains(200)- "+sum.contains(200));
		
		System.out.println("\ncontains(600)	- "+sum.contains(600));
		
		System.out.println("\n4. remove(400)	- "+sum.remove(400));
		
		System.out.println("\nAfter remove(400) HashSet is	- "+sum);
		
		sum.clear();
		System.out.println("\n5. HashSet After Clear		- "+sum);
	}
}