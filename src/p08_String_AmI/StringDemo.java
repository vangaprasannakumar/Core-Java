package p08_String_AmI;
public class StringDemo {
	public static void main(String[] args) {
		String s = "Kanna";
		String k = s.concat(" Lucky");
		System.out.println(s);
		System.out.println(k);							// 1 Concat
		System.out.println(s.equals("kanna"));			// 2 equals---lower k
		System.out.println(s.equalsIgnoreCase("kanna"));// 3 equalsIgnoreCase
		System.out.println(s.charAt(1));				// 4 charAt
		System.out.println(s.contains("A"));			// 5 contains---A not exit
		System.out.println(s.contains("K"));			// 				K-Kanna
		System.out.println("");
		
		String w = "Prasann Kumar Vanga";
		System.out.println(w.contains("Kumar"));
		System.out.println(w.contains("kumar"));
		System.out.println(w.substring(4));				// 6 substring
		System.out.println(w.substring(3,16));
		System.out.println(w.toUpperCase());			// 7 toUpperCase
		System.out.println(w.toLowerCase());			//  toLowerCase
		System.out.println("");
		
		String t = "        Prasann Kumar Vanga";
		System.out.println(t);
		System.out.println(t.trim());					// 8 trim
		System.out.println("");
		
		System.out.println("-------------");
		String x = "Wlecome to java, string concept";
		String[] y = x.split("to");						// 9 split
		System.out.println(y);
		for(String z : y) {
			System.out.println(z);
		}
		System.out.println("__________________");
		
		StringBuffer s1 = new StringBuffer("Mummy");
		StringBuilder s2 = new StringBuilder("Lucky");
		s1.append(" Daddy");							// 10 append
		s2.append(" Baby");
		System.out.println(s1);
		System.out.println(s2);
	}
}