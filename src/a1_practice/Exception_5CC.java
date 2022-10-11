package a1_practice;
abstract class Biryani{
	abstract void cost();
}
class NonVeg extends Biryani {
	void cost() {
		System.out.println("There are so many types of NonVeg Biryani");
	}
}
class ChickenBiryani extends NonVeg{
	void cost() {
		System.out.println("Full Plate Chicken Biryani cost ₹240");
	}
}
public class Exception_5CC {
	public static void main(String[] args) {
		try {
			ChickenBiryani cb =(ChickenBiryani) new NonVeg();
			cb.cost();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}