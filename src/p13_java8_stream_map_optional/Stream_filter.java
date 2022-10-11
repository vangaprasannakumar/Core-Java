package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Branch{
	private int no_students;
	private String branch_name;
	private int no_lecturer;
	public Branch(int no_students, String branch_name, int no_lecturer) {
		super();
		this.no_students = no_students;
		this.branch_name = branch_name;
		this.no_lecturer = no_lecturer;	
	}
	public int getno_students() {
		return no_students;
	}
	public void setno_students(int no_students) {
		this.no_students = no_students;
	}
	public String getbranch_name() {
		return branch_name;
	}
	public void setbranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public int getNo_lecturer() {
		return no_lecturer;
	}
	public void setNo_lecturer(int no_lecturer) {
		this.no_lecturer = no_lecturer;
	}	
}
public class Stream_filter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Branch> obj = new ArrayList<>();
		obj.add(new Branch(120,"CIV",12));
		obj.add(new Branch(60,"MEC",8));
		obj.add(new Branch(48,"EEE",9));
		obj.add(new Branch(86,"MNG",6));
		obj.add(new Branch(116,"CSE",10));
		obj.add(new Branch(68,"ECE",7));
		obj.add(new Branch(32,"AIE",4));
		System.out.println("above 80");

		List<Branch> fl = obj.stream().filter(x->x.getno_students()>=80).collect(Collectors.toList());
		fl.forEach(t -> System.out.println( "No. Students is " +t.getno_students()+"	→ Branch " 
		+t.getbranch_name() + "	→  No. Lecturer "+t.getNo_lecturer()));
		
		while(true)
		{
		System.out.print("\nenter the name :");
		String name = input.next();
		List<Branch> filter = obj.stream().filter(x->name.equalsIgnoreCase(x.getbranch_name())).collect(Collectors.toList());
				filter.forEach(x->System.out.println("No. Students is " +x.getno_students()+"	→ Branch " 
								+x.getbranch_name() + "	→  No. Lecturer "+x.getNo_lecturer()));
		String choice;
		System.out.print("\nwant to check another type y : ");
		choice = input.next();
		if(!choice.equalsIgnoreCase("y")) {
			break;
			}
		}
	}
}
