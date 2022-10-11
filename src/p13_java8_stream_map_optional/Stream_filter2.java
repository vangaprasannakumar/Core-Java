package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_filter2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		for(int i = 1; i<=10; i++) {
			obj.add(i);
		}
		System.out.println(obj);
		

		List<Integer> li = obj.stream().filter(i->i%2 != 1).collect(Collectors.toList());
		System.out.println("these are the even numbers");
		li.forEach(a->System.out.println(a));
	}

}