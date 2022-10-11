package p10_Exception;

public class Exception_1A_N {

	public static void main(String[] args) {
		int a=5;
		String b = null;
		
		System.out.println("Statement-1");
		
		try {
			System.out.println("Statement-2 & Div = "+(a/0));
			System.out.println("Statement-3");
		}catch(ArithmeticException e) {
			System.out.println("\n---ArithmeticException---");
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println("Statement-3 inside Exception"+"\n");
		}
		System.out.println("Statement-4");
		try {
		System.out.println("Statement-5");
		System.out.println(b.length());
		}catch (NullPointerException n) {
			System.out.println("\n---NullPointerException---");
			n.printStackTrace();
			System.out.println(n.toString()+"\n");
			
		}
		System.out.println("Statement-6");			
	}
}