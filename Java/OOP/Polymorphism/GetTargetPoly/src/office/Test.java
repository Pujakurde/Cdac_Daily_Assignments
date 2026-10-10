package office;

import staff.Administrator;
import staff.Programmer;
import staff.SalesManager;
import utility.Date;
import utility.Emp;

public class Test {

	public static void main(String[] args) {
		Emp [] allemps;																																										
		allemps = new Emp[3];
		allemps[0]= new SalesManager("Puja", new Date(12,10,2004), 12, 500000.00,2.0, 1000.0);
		allemps[1]= new Programmer("Dyna", new Date(11,1,2004), 11, 600000.00,"ERP",6,5000.0);
		allemps[2]= new Administrator("Rucha", new Date(15,7,2004) , 15, 700000.00,800000.00);
	
		ShowMoreDetails(allemps);
	
	}
	static void ShowMoreDetails(Emp [] arr)
	{
		
		for(Emp e:arr ) 
		{
			if(e instanceof SalesManager)
				System.out.println("Sales Manager Sales Target: "+((SalesManager)e).getSalesTarget());
			if(e instanceof Programmer)
				System.out.println("Programmmer Project Name: "+((Programmer)e).getProjectTitle());
			if(e instanceof Administrator)
				System.out.println("Administrator Allowance: "+((Administrator)e).getAllowance());
		}
		
	}
	


}
