package p02_LV_VD;
class Student{
	int id;
	double marks;
	static String college;
}
public class Variable_Demo {
	public static void main(String[] args) {
		Student rahul=new Student();
		
		rahul.id=124;
		rahul.marks=968.4;
		Student.college="Govt.Polytechnic Rudrampur";
		
		System.out.println("ID 	= "+rahul.id);
		System.out.println("Marks 	= "+rahul.marks);
		System.out.println("College Name = "+Student.college);
		
		System.out.println("--------------");
		
		Student kiran=new Student();
		
		System.out.println("ID 	= "+kiran.id);
		System.out.println("Marks 	= "+kiran.marks);
		System.out.println("College Name = "+Student.college);
	}
}
