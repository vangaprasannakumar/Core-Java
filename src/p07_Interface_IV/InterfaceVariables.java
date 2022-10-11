package p07_Interface_IV;
interface Parentt{
	int age=54;

interface Childd{
	int age=22;
}
}
class Details implements Parentt{
	void details() {
			System.out.println("parent age is "+Parentt.age);
			System. out. println("Chi1d age is "+Childd.age);
	}
}
public class InterfaceVariables {

	public static void main(String[] args) {
		Details d = new Details();
		d.details();
	}
}