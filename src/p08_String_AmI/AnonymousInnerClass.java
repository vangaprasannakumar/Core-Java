package p08_String_AmI;

abstract class Person{
	abstract void eat();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person kanna = new Person() {

			@Override
			void eat() {
				System.out.println("Kanna eating Biryani");
			}
			
		};
		kanna.eat();
	}

}