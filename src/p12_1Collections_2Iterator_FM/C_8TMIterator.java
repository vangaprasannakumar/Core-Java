package p12_1Collections_2Iterator_FM;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class C_8TMIterator {

	public static void main(String[] args) {
		TreeMap<Double, Character> tm = new TreeMap<>();
		tm.put(9.6, 'A');
		tm.put(5.2, 'F');
		tm.put(8.4, 'B');
		tm.put(5.9, 'E');
		tm.put(7.8, 'C');
		tm.put(4.8, 'G');
		tm.put(4.2, 'H');
		tm.put(6.6, 'D');
		System.out.println(tm+"\n");
		Set t = tm.entrySet();
		Iterator i = t.iterator();
		
		while(i.hasNext()) {
			Entry<Double, Character> e =(Entry<Double, Character>) i.next();
			System.out.println(e);
		}
	}
}