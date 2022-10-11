package a1_practice;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String[] str = new String[10];
		str[0] = "Kanna";
		System.out.println(str[0]+" Length is " +str[0].length()+"\n");
		Optional<String> oc = Optional.ofNullable(str[1]);
		if(oc.isPresent()) {
		System.out.println(str[1].length());
		}
		else {
			System.out.println("String is Null");
		}
		System.out.println("\nAfter NullPointer Exception");
		System.out.println("\nTHE END");
	}
}