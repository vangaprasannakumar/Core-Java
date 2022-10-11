package p05_Inheritance_MOR;
class Electronicss{
	void company(){
		System.out.println("There are no.of electronic Company's");
	}
}
class Mobilee extends Electronicss{
	void featuers() {
		System.out.println("Mobiles are mainly used for communication");
	}
}
class iPhone extends Mobilee{
	void Camera(){
		System.out.println("iPhone Mobiles are very popular for Camera");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		iPhone p = new iPhone();
		p.company();
		p.featuers();
		p.Camera();
		
	}
}
