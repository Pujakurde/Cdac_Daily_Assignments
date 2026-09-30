package office;

import java.util.TreeSet;
//import office.SalaryComparator;
public class EmployeeDemo {

	public static void main(String[] args) {
		TreeSet<Employee> emp =
				new TreeSet<>(
		(e1,e2)->Double.compare(e1.salary, e2.salary));
		
		emp.add(new Employee(10,"Puja",500000));
		emp.add(new Employee(11,"Rucha",600000));
		emp.add(new Employee(12,"Nano",700000));
		emp.add(new Employee(13,"Shoru",800000));
		for(Employee e: emp) {
			System.out.println(e);
		}

	}

}
