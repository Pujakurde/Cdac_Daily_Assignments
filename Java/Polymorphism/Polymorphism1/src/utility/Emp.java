package utility;

import utility.Date;
import utility.Person;

public class Emp extends Person 
{
	private int emp_id;
	private double sal;

	public Emp() 
	{
		//super(name,new Date(i,j,k));
		emp_id=0;
		sal=0;
	}
	

	public Emp(String name, Date birth_date, int emp_id, double sal) 
	{
		super(name, birth_date);
		this.emp_id=emp_id;
		this.sal=sal;
	}
	public Emp(String name, int i, int j, int k, int l,int emp_id,double sal) 
	{
		super(name,new Date(i,j,k));
		this.emp_id=emp_id;
		this.sal=0;
	}

	public void display()
	{
		super.display();
		System.out.println("Emp id: "+emp_id);
		System.out.println("Employee Salary: "+sal);
	}


	@Override
	public String toString() {
		return super.toString()+"\nEmp ID: " + emp_id + "\nSalary: " + sal ;
	}
	

}
