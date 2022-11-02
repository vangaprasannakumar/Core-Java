package p06_Abstract_NestedClass;
//Topic :- Zero argument Constructor in Abstract Class
abstract class PrimarySchool{
	PrimarySchool(){
		System.out.println("Everyone Must Wear Uniform");
	}
	abstract void input();
	final void show() {
		System.out.println("It's Mandatory");
	}
}
class Boys extends PrimarySchool{
	void input() {
		System.out.println("All Boys Should Defnitaly Tuck your Shirt");
	}
}
class Girls extends PrimarySchool{
	void input() {
		System.out.println("All Girls Should Defnitaly Wear two braids");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		PrimarySchool s;
		s = new Boys();
		s.input();
		s.show();
		System.out.println("-----------");
		s = new Girls();
		s.input();
		s.show();
	}
}
