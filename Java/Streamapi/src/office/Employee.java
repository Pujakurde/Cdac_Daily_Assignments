package office;

public class Employee {
	
	/*create emp attribute
no arg,paraa,tostring,
streamapi stream of employee create
one line=one emp instance using map
split()
paths.get  */
	
	private int id;
	private String name;
	private String dept;
	private double salary;
	private String city;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String dept, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee ID: " + id + " Name" + name + " Dept: " + dept + " Salary: " + salary + " City: " + city;
	}
	
	
	

}
