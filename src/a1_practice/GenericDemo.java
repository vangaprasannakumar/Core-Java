package a1_practice;

class Sample<Generic>{
	void show(Generic a) {
		System.out.println(a+"\n");	
	}
}
public class GenericDemo {

	public static void main(String[] args) {
		
		Sample<Integer> i = new Sample<>();
		System.out.print("Integer		- ");
		i.show(124);
		Sample<Double> d = new Sample<>();
		System.out.print("Double		- ");
		d.show(8.3);
		Sample<String> s = new Sample<>();
		System.out.print("String		- ");
		s.show("Prasanna Kumar");
		Sample<Character> c = new Sample<>();
		System.out.print("Character	- ");
		c.show('A');
	}

}