package staff;

import utility.Date;
import utility.Emp;

public class Programmer extends Emp {
	private String projectTitle;
	private int extraHour;
	private double chargesPerHour;
	
	public Programmer() {
		super();
		
	}

	public Programmer(String name, Date birth_date, int emp_id, double sal,String projectTitle,int extraHour,double chargesPerHour) 
	{
		super(name, birth_date, emp_id, sal);
		this.projectTitle=projectTitle;
		this.extraHour=extraHour;
		this.chargesPerHour=chargesPerHour;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Project Title: "+projectTitle);
		System.out.println("No of extra Hours: "+extraHour);
		System.out.println("Charges per Hours: "+chargesPerHour);
	}
	
	

}
