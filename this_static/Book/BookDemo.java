class BookDemo
{
	public static void main(String[] args)
	{
		Book b1=new Book("OOP Concepts");
		b1.setPrice(120.45f);
		b1.display();
		
		Book b2=new Book("Java");
		b2.setPrice(150.45f);
		b2.display();
		
		Book b3=new Book();
		b3.setPrice(10.45f);
		b3.display();
	}
}