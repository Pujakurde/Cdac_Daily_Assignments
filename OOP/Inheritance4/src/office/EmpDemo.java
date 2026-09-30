package office;
import staff.Administrator;
import staff.Programmer;
import staff.SalesManager;
import utility.Date;


public class EmpDemo {

	public static void main(String[] args) 
	{
		SalesManager s1= new SalesManager("Puja", new Date(12,10,2004), 12, 500000.00,2.0, 1000.0);
		s1.display();
		
		Programmer p1= new Programmer("Dyna", new Date(11,1,2004), 11, 600000.00,"ERP",6,5000.0);
		p1.display();
		
		Administrator a1= new Administrator("Rucha", new Date(15,7,2004) , 15, 700000.00,800000.00);
		a1.display();
		
		
		

	}

}
