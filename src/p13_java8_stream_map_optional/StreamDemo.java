package p13_java8_stream_map_optional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Kavya	",72000));
		list.add(new Employee(104, "Usha	",58000));
		list.add(new Employee(106, "Harsha	",68000));
		list.add(new Employee(109, "Sri	",80000));
		list.add(new Employee(120, "Bhargavi	",65000));
		list.add(new Employee(118, "Nagul	",52000));
		list.add(new Employee(120, "Rasheed	",76000));
		list.add(new Employee(124, "Kanna	",88000));

		System.out.println("»»»»» Iterator All Value «««««\n");
		Iterator<Employee> li = list.iterator();
		while(li.hasNext()) {
			Employee ee=li.next();
				System.out.println(ee.getEid( )+"  "+ee. getEname()+"  "+ee.getSalary());
		}
		System.out.println("\n»»»»» Iterator Single Value «««««\n");
		
		Iterator<Employee> lii = list.iterator();
		while(lii.hasNext()) {
			Employee ee=lii.next();
			if(ee.getSalary() == 88000) {
				System.out.println(ee.getEid( )+"  "+ee. getEname()+"  "+ee.getSalary());
			}
		}
		
		System.out.println("\n»»»»» Stream Single Value «««««\n");
		List<Employee> fl = list.stream().filter(x -> x.getSalary()==80000).collect(Collectors.toList());
		fl.forEach(t ->System.out.println(t.getEid()+"  "+t.getEname()+"  "+t.getSalary()));
	}
}