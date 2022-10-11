package p12_1Collections_2Iterator_FM;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C_4ListDemo {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(24);
		al.add(49);
		al.add(96);
		al.add(31);
		al.add(25);
		al.add(01);
		al.add(20);
		al.add(13);
		al.add(49);
		al.add(56);
		al.add(63);
		al.add(81);
		al.add(54);
		System.out.println(al+"\n");
		
		List<Integer> ll = new LinkedList<Integer>();
		ll.add(24);
		ll.add(49);
		ll.add(96);
		ll.add(31);
		ll.add(25);
		ll.add(01);
		ll.add(20);
		ll.add(13);
		ll.add(49);
		ll.add(56);
		ll.add(63);
		ll.add(81);
		ll.add(54);
		System.out.println(ll+"\n");
	}
}