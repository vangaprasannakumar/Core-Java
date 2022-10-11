package p02_LV_VD;
class Students{
	String name;
	short id;
	long number;
	double marks;
	char grade;
	static String college;
	static int clgcode;
}
public class Variables_Demo_T {
	public static void main(String[] args) {
		Students lucky=new Students();
		lucky.name="V. Prasanna Kumar";
		lucky.id=124;
		lucky.marks=968.4;
		lucky.grade='A';
		lucky.number=919963961371l;
		Students.college="MIST";
		Students.clgcode=9790;
		
		System.out.println("Name 		=  "+lucky.name);
		System.out.println("ID 		=  "+lucky.id);
		System.out.println("Number 		=  +"+lucky.number);
		System.out.println("Marks 		=  "+lucky.marks);
		System.out.println("Grade 		=  "+lucky.grade+"+");
		System.out.println("College Name 	=  "+Students.college);
		System.out.println("College code 	=  "+Students.clgcode);
	}
}
