package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream_Sorted {

	public static void main(String[] args) {
		List<Integer> f= new ArrayList<Integer>();
		System.out.println("Elements");
		Random d = new Random();
		 for(int i=0;i<=10;i++) {
			 int num = d.nextInt(10);
			 f.add(num);
		 }
		 System.out.println(f);
		 List<Integer> sortList=f.stream().distinct().limit(6).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		 System.out.println("natural order");
		 sortList.forEach(System.out::println);
		 List<Integer> sortList1=f.stream().distinct().limit(6).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		 System.out.println("reverse order");
		 sortList1.forEach(x->System.out.println(x));
	}

}