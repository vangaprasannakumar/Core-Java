package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.List;

public class Stream_Sequential {
	public static void main(String[] args) {
	List<Character> obj = new ArrayList<Character>();
	obj.add('P');
	obj.add('S');
	obj.add('K');
	obj.add('U');
	obj.add('H');
	obj.add('R');
	obj.stream().forEach(x->System.out.println(x));
	}
}