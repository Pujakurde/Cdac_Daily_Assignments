package office;
import staff.Administrator;
import staff.Programmer;
import staff.SalesManager;
import utility.Date;
import utility.Emp;


public class EmpDemo {

	public static void main(String[] args) 
	{
		Emp [] allemps;
		allemps = new Emp[3];
		allemps[0]= new SalesManager("Puja", new Date(12,10,2004), 12, 500000.00,2.0, 1000.0);
		allemps[1]= new Programmer("Dyna", new Date(11,1,2004), 11, 600000.00,"ERP",6,5000.0);
		allemps[2]= new Administrator("Rucha", new Date(15,7,2004) , 15, 700000.00,800000.00);
	
		for(int i=0; i<allemps.length; i++ ) 
		{
				allemps[i].display();
				System.out.println("*******************");
		}
		
		for(int i = 0; i < allemps.length; i++)
		{
			System.out.println(allemps[i]+"\n");
		}
		System.out.println("-----------------------------------");
		//advanced for loop(for-each loop)
		double sum = 0;
		for(Emp e  : allemps) {
			sum+=e.calculateSalary() ;
			System.out.println("Salary : "+e.calculateSalary() );   
		}
		System.out.println("Total salary : "+sum);
		
	
	}

}
