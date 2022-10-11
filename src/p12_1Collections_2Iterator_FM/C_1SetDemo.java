package p12_1Collections_2Iterator_FM;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class C_1SetDemo {
	public static void main(String[] args) {
		
		System.out.println("HashSet :-");
		Set<String> hs = new HashSet<String>();
		hs.add("A");
		hs.add("S");
		hs.add("D");
		hs.add("F");
		hs.add("G");
		hs.add("A");
		hs.add(" ");
		hs.add("H");
		hs.add("J");
		hs.add("S");
		hs.add("L");
		System.out.println(hs);
		
		System.out.println("\n"+"LinkedHashSet :-");
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("A");
		lhs.add("S");
		lhs.add("D");
		lhs.add("F");
		lhs.add("G");
		lhs.add("A");
		lhs.add(" ");
		lhs.add("H");
		lhs.add("J");
		lhs.add("S");
		lhs.add("L");
		System.out.println(lhs);
		
		System.out.println("\n"+"TreeSet :-");
		Set<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("S");
		ts.add("D");
		ts.add("F");
		ts.add("G");
		ts.add("A");
		ts.add(" ");
		ts.add("H");
		ts.add("J");
		ts.add("S");
		ts.add("L");
		System.out.println(ts);
	}
}