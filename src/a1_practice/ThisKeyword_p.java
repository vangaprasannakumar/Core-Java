package a1_practice;
class Employee{
	int employee_id ;
	double employee_salary ;
	static String company;
	
	Employee (int employee_id ,double employee_salary) {
		this("TCS");
	    this.employee_id = employee_id;
	    this.employee_salary = employee_salary;
	    this.show();
	}
	Employee(String company){
		Employee.company=company;
	}
	void show() {
	    System.out.println ("this	= "+this);
	    System.out.println ("Id	= "+employee_id);
	    System.out.println ("salary	= "+employee_salary);
	    System.out.println("company = "+company);
	}
}
public class ThisKeyword_p {
	public static void main(String[] args) {
		Employee shiva = new Employee(1023,45000);
		
		System.out.println("-------------");
		
		Employee lucky = new Employee(1024,65000);
	}
}
