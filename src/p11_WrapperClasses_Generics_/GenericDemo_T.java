package p11_WrapperClasses_Generics_;

class StudentInfo<Generic>{
	void details(Generic a) {
		System.out.println(a);	
	}
}
public class GenericDemo_T {

	public static void main(String[] args) {
		
		StudentInfo<Integer> i = new StudentInfo<>();
		System.out.print("PIN	- ");
		i.details(124);
		
		StudentInfo<String> s = new StudentInfo<>();
		System.out.print("Name	- ");
		s.details("Prasanna Kumar Vanga");
		
		StudentInfo<Double> d = new StudentInfo<>();
		System.out.print("Marks	- ");
		d.details(920.4);
		
		StudentInfo<Character> c = new StudentInfo<>();
		System.out.print("Grade	- ");
		c.details('A');
	}
}