package p04_Constructor_This_super;
class Faculty{
	Faculty(int marks){
		System.out.println("Faculty conducted a tesk with Max marks = "+marks);
	}
}
class Student1 extends Faculty{
	Student1(int marks){
		super(100);
		System.out.println("Student Scored marks = "+marks);
	}
}
public class SuperKeywordTask {
	public static void main(String[] args) {
		Student1 obj = new Student1(98);
	}
}
