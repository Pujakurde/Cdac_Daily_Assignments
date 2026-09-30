package Library;

public class PaperBook extends Book {
	private int NoofPages;
	Date Datepub;
	
	public PaperBook() {
		super();
		NoofPages=0;
		Datepub=new Date();
		
	}
	public PaperBook(int id, String title, float price,int n,Date dd) 
	{
		super(id, title, price);
		NoofPages=n;
		Datepub=dd;
	}
	public PaperBook(int id, String title, float price,int n,int dd,int mm,int yy) 
	{
		super(id, title, price);
		NoofPages=n;
		Datepub=new Date(dd,mm,yy);
	}
	public int getNoofPages() {
		return NoofPages;
	}
	public void setNoofPages(int noofPages) {
		NoofPages = noofPages;
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("No of Pages: "+getNoofPages());
		Datepub.display();
	}

}
