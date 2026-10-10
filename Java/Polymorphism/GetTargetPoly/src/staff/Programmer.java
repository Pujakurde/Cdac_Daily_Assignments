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
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Project Title: "+projectTitle);
		System.out.println("No of extra Hours: "+extraHour);
		System.out.println("Charges per Hours: "+chargesPerHour);
	}

	@Override
	public String toString() {
		return super.toString() +"\nProject Title: " + projectTitle + "\nExtra Hour=" + extraHour + "\nCharges Per Hour: "+ chargesPerHour ;
	}
	@Override
	public double calculateSalary() {
	    return super.calculateSalary() + (extraHour * chargesPerHour);
	}

	public String getProjectTitle() {
		return projectTitle;
	}
	

	
	
	
	
	
	

}
