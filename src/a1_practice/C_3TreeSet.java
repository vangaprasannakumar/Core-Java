package a1_practice;

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
		System.out.println("\n first()	- "+E.first());
		System.out.println("\n last()		- "+E.last());
		System.out.println("\n higher(20)	- "+E.higher(20));
		System.out.println("\n lower(80)	- "+E.lower(80));
		System.out.println("\n floor(100)	- "+E.floor(160));
		System.out.println("\n ceiling(80)	- "+E.ceiling(120));
		System.out.println("\n pollFirst()	- "+E.pollFirst());
		System.out.println("\n pollLast()	- "+E.pollLast());
		System.out.println("\n subSet(50, 120)- "+E.subSet(50, 120));
		System.out.println("\n headSet(50)	- "+E.headSet(50));
	
	}
}