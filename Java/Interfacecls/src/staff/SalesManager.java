package staff;

import office.utility.Date;
import office.utility.iTraveller;
import staff.Emp;

public class SalesManager extends Emp implements iTraveller
{
	private double salesTarget;
	private double percommision;
	private int travelHours;
	private String passportDetails;
	private int passportNo;
	
	public SalesManager() {
		super();
	}

	public SalesManager(double salesTarget, double percommision, int travelHours, String passportDeatils) {
		super();
		this.salesTarget = salesTarget;
		this.percommision = percommision;
		this.travelHours = travelHours;
		this.passportDetails = passportDetails;
		this.passportNo = passportNo;
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
	
	
	public String getPassportDetails() {
	    return passportDetails;
	}

	public int getPassportNo() {
	    return passportNo;
	}

	public int getTravelHours() {
	    return travelHours;
	}
	
}
