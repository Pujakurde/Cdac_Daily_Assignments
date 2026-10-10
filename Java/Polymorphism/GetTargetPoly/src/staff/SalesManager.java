package staff;

import utility.Date;
import utility.Emp;

public class SalesManager extends Emp 
{
	private double salesTarget;
	private double percommision;
	
	
	public SalesManager() {
		super();
	}


	public SalesManager(String name, Date birth_date, int emp_id, double sal,double salesTarget, double percommision) {
		super(name, birth_date, emp_id, sal);
		this.salesTarget = salesTarget;
		this.percommision = percommision;
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Sales Manager Target : "+salesTarget);
		System.out.println("Commission per Sales Manager : "+percommision);
	}


	@Override
	public String toString() {
		return super.toString()+"\nSalesTarget: " + salesTarget + "\nPer commision: " + percommision ;
	}
	@Override
	public double calculateSalary() {
	    return super.calculateSalary() + (salesTarget * percommision);
	}


	public double getSalesTarget() {
		return salesTarget;
	}
	
	


}
