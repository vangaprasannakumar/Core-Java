package a2_task;
class Cars{
	void specifications() {
		System.out.println("ABS, or Anti-Lock Braking System.");
		System.out.println("Electronic Brake Distribution(EBD)");
		System.out.println("Drivetrain,Airbags");
	}
}
class Benz extends Cars{
	void extra_specifications() {
		System.out.println("Benz has extra specifications that is Automatic Climate Control");
	}
}
class Jaguar extends Cars{
	void extra_specifications() {
		System.out.println("Jaguar has extra specifications that is Multi-function Steering Wheel");
	}
}
public class Hiererical_Inheritance {
	public static void main(String[] args) {
		System.out.println("»»» The specifications of Benz Car «««\n");
		
		Benz b = new Benz();
		b.specifications();
		b.extra_specifications();
		
		System.out.println("------------");
		
		System.out.println("»»» The specifications of Jaguar Car «««\n");
		Jaguar j = new Jaguar();
		j.specifications();
		j.extra_specifications();
	}
}
