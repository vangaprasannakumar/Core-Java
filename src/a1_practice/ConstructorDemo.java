package a1_practice;
//Practice
class Employee1{
	int employee_id ;
	double employee_salary ;
	
	Employee1 () {
	    employee_id = 1023;
	    employee_salary = 45000;
	}
	void show() {
	    System.out.println ("Id	= "+employee_id);
	    System.out.println ("salary	= "+employee_salary);
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Employee1 shiva = new Employee1();
		shiva.show();
		
		System.out.println("-------------");
		
		Employee1 lucky = new Employee1();
		lucky.show();
	}
}
