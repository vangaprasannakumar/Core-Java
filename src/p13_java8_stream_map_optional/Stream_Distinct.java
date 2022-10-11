package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Stream_Distinct {

	public static void main(String[] args) {
		List<Integer> g=new ArrayList<Integer>();
		System.out.println("Elements");
		Random d = new Random();
		for(int i=0;i<=10;i++) {
			int num = d.nextInt(10);
			g.add(num);
		}
		System.out.println(g);
			List<Integer>f=g.stream().distinct().collect(Collectors.toList());
			System.out.println("\nDistinct elements");
			System.out.println(f);
	}

}