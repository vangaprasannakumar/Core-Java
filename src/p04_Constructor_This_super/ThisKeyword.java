package p04_Constructor_This_super;
//Extra Task
class Bikes{
	String Bikes_model ;
	double Bikes_Price;
	static String company;
	
	Bikes(String Bikes_model,double Bikes_Price) {
		this("BMW");
	    this.Bikes_model = Bikes_model;
	    this.Bikes_Price = Bikes_Price;
	    this.show();
	}
	Bikes(String company){
		Bikes.company=company;
	}
	void show() {
	    System.out.println ("this		= "+this);
	    System.out.println ("Bike Model	= "+Bikes_model);
	    System.out.println ("Bike Price	= "+Bikes_Price);
	    System.out.println("company 	= "+company);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		Bikes shiva = new Bikes("G 310 GS",305000);
		System.out.println("-------------");
		Bikes lucky = new Bikes("M 1000 RR",4500000);
	}
}
