package Library;

public class Book {
	private int id;
	private String title;
	private float price;
	
	public Book() 
	{
		//super();
		id=0;
		title=" ";
		price=0.0f;
	}

	public Book(int id, String title, float price) {
		//super();
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void Display()
	{
		System.out.println("Book id: "+getId());
		System.out.println("Book Title: "+getTitle());
		System.out.println("Book Price: "+getPrice());
	}

}
