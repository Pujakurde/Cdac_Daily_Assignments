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
	
	public void display()
	{
		super.display();
		System.out.println("Allowance: "+allowance);
	}


	
	

}
