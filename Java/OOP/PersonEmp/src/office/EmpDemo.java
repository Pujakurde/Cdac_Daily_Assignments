package office;

import staff.Emp;
import utility.Date;

public class EmpDemo {

	public static void main(String[] args) {
		Emp e1=new Emp("Puja",new Date(12,10,2004),10,500000.0);
		e1.display();
	}

}
