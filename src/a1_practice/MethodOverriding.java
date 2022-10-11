package a1_practice;
class Car {
    void cost ( ) {
        System.out.println("No cost");}
    void milage ( ) {
        System.out.println("No milage");}
}
class Audi extends Car {
    void cost ( ) {
        System.out.println("Audi cost is 50 lakhs");}
    void milage ( ) {
        System.out.println ("Audi milage is 15km" ) ;}
}
class Bmw extends Car {
    void cost ( ) {
        System.out.println("Bmw cost is 40 lakhs");}
    void milage ( ) {
        System.out.println("Bmw milage is 10km");}
}
class CarFactory{
	Car getCar(String carName) {
		if(carName.equals("Audi")) {
			return new Audi();}
		if(carName.equals("Bmw")) {
			return new Bmw();}
		else {
			return null;}
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		CarFactory i = new CarFactory();
		Car x = i.getCar("Audi");
		x.cost();
		x.milage();
		System.out.println("\n-----------------------------\n");
		Car y = i.getCar("Bmw");
		y.cost();
		y.milage();
	}
}

		/*
		Car x=new Car();
		x.cost();
		x.milage();
		System.out.println("-------");
		x = new Audi();
		x.cost();
		x.milage();
		System.out.println("-------");
		x = new Bmw();
		x.cost();
		x.milage();
		*/
