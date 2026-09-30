package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class EmployeeDemo {
	public static void main(String[] args) {
		
		List<Employee> emp= new ArrayList<>();
		emp.add(new Employee(10, "Puja", 500000, "IT"));
		emp.add(new Employee(11, "Rucha", 600000, "HR"));
		emp.add(new Employee(12, "Nano", 700000, "Sales"));
		emp.add(new Employee(13, "Shoru", 800000, "Finance"));
		//emp.sort((e1, e2) ->Double.compare(e1.getSalary(), e2.getSalary()));
		emp.sort(Comparator.comparing(e->e.name));
		System.out.println("Sorted on name: "+emp);
		emp.sort(Comparator.comparingDouble((Employee e)->e.salary).reversed());
		System.out.println("Sorted on salary: "+emp);
		emp.sort(Comparator.comparingDouble((Employee e)->e.salary)
				.thenComparing(e->e.name)
				.thenComparing(e->e.id));
		System.out.println("Sorted on salary then name then id: "+emp);
		
	}

}
