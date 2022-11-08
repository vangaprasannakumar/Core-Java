package a2_class;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicateCharacters {
	public static void main(String[] args) {
		System.out.println(m());		
	}
	static boolean m() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the name");
		String x = input.next();
		Set<Character> obj = new HashSet<Character>();
		for(int i = 0; i<x.length(); i++) {
			if(obj.contains(x.charAt(i))) {
			return false;
			}
			else {
				obj.add(x.charAt(i));
			}	
		}
	
		return true;

	}

}