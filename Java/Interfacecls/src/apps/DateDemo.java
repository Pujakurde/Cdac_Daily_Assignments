package apps;

import office.utility.Date;
import office.utility.Person;
public class DateDemo {

	public static void main(String[] args) {
		Date d1 = new Date(12,2,2000);
		d1.display();
		
		Person p1 = new Person("Amit", 12,1,1999);
		p1.display();

	}

}
