package staff;

import utility.Date;
import utility.Emp;

public class Administrator extends Emp 
{
	private double allowance;

	public Administrator() 
	{
		super();
	}

	public Administrator(String name, Date birth_date, int emp_id, double sal,double allowance) 
	{
		super(name, birth_date, emp_id, sal);
		this.allowance=allowance;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Allowance: "+allowance);
	}

	@Override
	public String toString() {
		return super.toString()+"\nAllowance: " + allowance ;
	}

	@Override
	public double calculateSalary() {
		
		return super.calculateSalary()+allowance;
	}
	
}
