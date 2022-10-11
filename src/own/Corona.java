package own;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Corona {

	public static void main(String[] args) {
		
		Patient p1= new Patient("p1", 20, "corona", 17000);
		Patient p2= new Patient("p2", 30, " fever", 7000);
		Patient p4= new Patient("p3", 40, "corona", 8000);
		Patient p3= new Patient("p4", 50, "corona", 12000);
		
		List<Patient> patients = Arrays.asList(p1,p2,p3,p4);

		List<Patient> x= Arrays.asList(p1,p2,p3,p4);
		Iterator o = patients.iterator();
		while(o.hasNext()) {
			System.out.println(o.next());
		}
		
		//patients.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println);
	}

}