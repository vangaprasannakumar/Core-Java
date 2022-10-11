package a1_practice;
abstract class Plants{
	abstract void lifeSpan();
	abstract void eats();
	void grow() {
		System.out.println("Every plan grow on Earth");
	}
}
class Rose extends Plants{
	void lifeSpan() {
		System.out.println("Rose Plan Life Span in between 6 to 10 years");
	}
	void eats() {
		System.out.println("Rose plant takes CO₂ and Lives");
	}
}
class VenusFlytrap extends Plants{
	void lifeSpan() {
		System.out.println("Venus Flytrap Plan Life Span is 20 years");
	}
	void eats() {
		System.out.println("Venus Flytrap is a carnivorous plant");
		System.out.println("Venus Flytrap eat Animals");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Plants p;
		p = new Rose();
		p.grow();
		p.lifeSpan();
		p.eats();
		System.out.println("------------");
		p = new VenusFlytrap();
		p.grow();
		p.lifeSpan();
		p.eats();
	}

}
