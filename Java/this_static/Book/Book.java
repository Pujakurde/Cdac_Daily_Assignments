class Book
{
	private int book_id;
	private String book_title;
	private float book_price;
	
	private static int count=0;
	
	public Book()
	{
		count++;
		this.book_id=count;
		this.book_title="Untitled";
		this.book_price=0.0f;	
	}
	
	public Book(String book_title)
	{
		count++;
		this.book_id=count;
		this.book_title=book_title;
		this.book_price=0.0f;	
	}
	
	public void setPrice(float book_price)
	{
		this.book_price=book_price;
	}
	public void display()
	{
		System.out.println("Book ID: " +book_id+" Book Title: "+book_title+" Book Price: "+book_price);
	}
}
		