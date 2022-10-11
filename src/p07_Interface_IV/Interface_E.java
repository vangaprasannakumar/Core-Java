package p07_Interface_IV;
interface Electronics{
	void cost();
	void features();
	static void common() {
		System.out.println("Every Electronic device need electric energy to work");}
}
abstract class Mobile implements Electronics{
	public void cost() {
	}
	void mainUse() {
		System.out.println("Main use is to communicate quickly with voice call");}
}
abstract class Laptop implements Electronics{
	public void cost() {}
	void parts() {
		System.out.println("Now a days every laptop have web cam");}
}
class Realme extends Mobile{
	public void cost() {
		System.out.println("Realme Mobile Cost is 20k");}
	public void features() {
		System.out.println("its popular for cameres");}
}
class Redmi extends Mobile{
	public void cost() {
		System.out.println("Redmi Mobile Cost is 15k");}
	public void features() {
		System.out.println("its popular for featuers");}
}
class Hp extends Laptop{
	public void cost() {
		System.out.println("Hp Basic Laptop cost is 60k");}
	public void features() {
		System.out.println("it's best in allrounder");}
}
class Dell extends Laptop{
	public void cost() {
		System.out.println("Dell Basic Laptop cost is 50k");}
	public void features() {
		System.out.println("it's best in Students");}
}
public class Interface_E {
	public static void main(String[] args) {
		Mobile r;
		r = new Realme();
		r.cost();
		r.features();
		r.mainUse();
		Electronics.common();
		System.out.println("-------------------");
		r = new Redmi();
		r.cost();
		r.features();
		r.mainUse();
		Electronics.common();
		System.out.println("\n"+"*******************");
		Laptop h;
		h = new Hp();
		h.cost();
		h.features();
		h.parts();
		Electronics.common();
		System.out.println("-------------------");
		h = new Dell();
		h.cost();
		h.features();
		h.parts();
		Electronics.common();
	}
}