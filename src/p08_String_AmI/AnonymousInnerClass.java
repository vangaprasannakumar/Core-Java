package p08_String_AmI;

abstract class Person{
	abstract void eat();
	abstract void go();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person kanna = new Person() {

			@Override
			void eat() {
				System.out.println("Kanna eating Brackfast and");
			}

			@Override
			void go() {
				System.out.println("Going to College");
			}
			
		};
		kanna.eat();
		kanna.go();
	}

}