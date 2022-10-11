package a1_practice;
interface vehicle{
	void cost();
	void milage();
	static void use() {
		System.out.println("Use to Travel");}
}
abstract class cars implements vehicle{
	public void cost() {
	}
	void Advantage() {
		System.out.println("Cars are very Comfortable to travel for long Distances");}
}
abstract class Bike implements vehicle{
	public void cost() {}
	void Advantage() {
		System.out.println("Bikes are More Economical then Cars");}
}
class Lamborghini extends cars{
	public void cost() {
		System.out.println("Lamborghini cost is 50 lakhs");}
	public void milage() {
		System.out.println("Lamborghini milage is 15km");}
}
class Benz extends cars{
	public void cost() {
		System.out.println("Benz cost is 40 lakhs");}
	public void milage() {
		System.out.println("Benz milage is 12km");}
}
class Re extends Bike{
	public void cost() {
		System.out.println("Re cost is 1.8 lakhs");}
	public void milage() {
		System.out.println("Re milage is 35 km");}
}
class R15 extends Bike{
	public void cost() {
		System.out.println("R15 cost is 1.5lakhs");}
	public void milage() {
		System.out.println("R15 milage is 40km");}
}
public class Interface {
	public static void main(String[] args) {
		System.out.println("\n"+"********* CARS *********"+"\n");
		cars r;
		r = new Lamborghini();
		r.cost();
		r.milage();
		r.Advantage();
		vehicle.use();
		System.out.println("-------------------");
		r = new Benz();
		r.cost();
		r.milage();
		r.Advantage();
		vehicle.use();
		System.out.println("\n"+"********* BIKES *********"+"\n");
		Bike h;
		h = new Re();
		h.cost();
		h.milage();
		h.Advantage();
		vehicle.use();
		System.out.println("-------------------");
		h = new R15();
		h.cost();
		h.milage();
		h.Advantage();
		vehicle.use();
	}
}