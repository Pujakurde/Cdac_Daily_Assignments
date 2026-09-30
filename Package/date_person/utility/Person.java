package utility;
public class Person
{
	int id;
	//String name;
	public Person()
	{
		id=0;
		//name=" ";
	}
	//public Person(int a,String b)
	public Person(int a)
	{
		id=a;
		//name=b;
	}
	public String display()
	{
		return id+" ";
	}
}