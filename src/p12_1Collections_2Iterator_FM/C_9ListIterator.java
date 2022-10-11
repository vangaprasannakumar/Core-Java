package p12_1Collections_2Iterator_FM;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class C_9ListIterator {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		Random num = new Random();
		for(int i=1;i<=10;i++) {
			al.add(num.nextInt(100));     
		}
		System.out.println(al+"\n");
		
		ListIterator i = al.listIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("------------------");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}
}