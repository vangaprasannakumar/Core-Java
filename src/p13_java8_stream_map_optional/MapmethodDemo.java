package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Students1{
	private String name;
	private int pin;
	private int marks;
	public Students1(String name, int pin, int marks) {
		super();
		this.name = name;
		this.pin = pin;
		this.marks = marks;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class MapmethodDemo {

	public static void main(String[] args) {
		
		ArrayList<Students1> al = new ArrayList<Students1>();
		al.add(new Students1("Kanna	", 124, 986));
		al.add(new Students1("Sri	", 109, 980));
		al.add(new Students1("Kavya	", 101, 960));
		al.add(new Students1("Usha	", 104, 950));
		al.add(new Students1("Harsha	", 106, 894));
		al.add(new Students1("Rasheed	", 120, 905));
		
		
		al.forEach(x->System.out.println("Name:	"+x.getName()+"\n"+"PIN:	"+x.getPin()+"\n"+"Marks:	"+x.getMarks()+"\n"));
		System.out.println("adding extra 10 marks to every student\n");
		List<String> m = al.stream().map(x-> x.getName()+" score --- "+(x.getMarks()+10)).collect(Collectors.toList());
		m.forEach(x->System.out.println(x));
	}

}