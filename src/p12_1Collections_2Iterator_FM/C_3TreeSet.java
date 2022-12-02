package p12_1Collections_2Iterator_FM;

import java.util.Random;
import java.util.TreeSet;

public class C_3TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> E = new TreeSet<Integer>();
		Random num = new Random();
		for(int i=0;i<=10;i++) {
			E.add(num.nextInt(200));
		}
		
		System.out.println("E Set is\n"+E);
		System.out.println("\nfirst()	- "+E.first());
		System.out.println("\nlast()		- "+E.last());
		System.out.println("\nhigher(20)	- "+E.higher(20));
		System.out.println("\nlower(80)	- "+E.lower(80));
		System.out.println("\nfloor(100)	- "+E.floor(160));
		System.out.println("\nceiling(80)	- "+E.ceiling(120));
		System.out.println("\npollFirst()	- "+E.pollFirst());
		System.out.println("\npollLast()	- "+E.pollLast());
		System.out.println("\nsubSet(50, 120)- "+E.subSet(50, 120));
		System.out.println("\nheadSet(50)	- "+E.headSet(50));
	
	}
}