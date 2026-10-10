package staff;

import office.utility.Date;
import office.utility.iTraveller;
import staff.Emp;


public class Programmer extends Emp implements iTraveller {
	private String projectTitle;
	private int extraHour;
	private double chargesPerHour;
	private int travelHours;
	private String passportDetails;
	private int passportNo;
	
	
	public Programmer() {
		super();
		
	}

	public Programmer(String projectTitle, int extraHour, double chargesPerHour, int travelHours,
			String passportDeatils,int passportNo) {
		super();
		this.projectTitle = projectTitle;
		this.extraHour = extraHour;
		this.chargesPerHour = chargesPerHour;
		this.travelHours = travelHours;
		this.passportDetails = passportDetails;
		this.passportNo = passportNo;
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
