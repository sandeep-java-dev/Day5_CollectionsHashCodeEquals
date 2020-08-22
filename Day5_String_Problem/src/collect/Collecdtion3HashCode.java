package collect;

import java.util.HashSet;
import java.util.Set;

public class Collecdtion3HashCode {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("ramesh", 101, 2000);
		Employee e2 = new Employee("ramesh", 101, 2000);
		Employee e3 = new Employee("mike", 102, 3000);
		Employee e4 = new Employee("suresh", 101, 2000);
		
		Set<Employee> empSet = new HashSet<>();
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		
		System.out.println(empSet.size());
		
	}
}
