package p10_Exception;

class StaticCass{
	static {
		System.out.println("Static Class");
	}
}
public class Exception_7CNF {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main Method");
		Class.forName("practice.StaticCass");
	}

}