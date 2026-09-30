package utility;

public class Person {
	private String name;
	Date birth_date;
	
	
	public Person() {
		setName(" ");
		birth_date=new Date();
	}


	public Person(String name, Date birth_date) {
		//super();
		this.setName(name);
		this.birth_date = birth_date;
	}
	public Person(String name, int dd, int mm, int yy) {
		super();
		this.name = name;
		this.birth_date = new Date(dd,mm,yy);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Name: "+getName());
		birth_date.display();
	}
}
