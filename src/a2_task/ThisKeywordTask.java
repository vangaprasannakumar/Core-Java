package a2_task;
class ClassMembers{
	int student_id ;
	String student_name ;
	static String college;
	
	ClassMembers(int student_id ,String student_name) {
		this("OU");
	    this.student_id = student_id;
	    this.student_name = student_name;
	    this.details();
	}
	ClassMembers(String college){
		ClassMembers.college=college;
	}
	void details() {
	    System.out.println ("ID Number	= "+student_id);
	    System.out.println ("Nmae		= "+student_name);
	    System.out.println("Colege		= "+college);
	}
}
public class ThisKeywordTask {
	public static void main(String[] args) {
		ClassMembers prasanna = new ClassMembers(257,"V. Prasanna Kumar");
		System.out.println("-------------");
		ClassMembers murali = new ClassMembers(258,"V. Murali Krishna");
	}
}
