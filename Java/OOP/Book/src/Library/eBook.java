package Library;

public class eBook extends Book {
	private String downUrl;
	private double sizeinMB;
	
	public eBook() {
		super();
		downUrl=" ";
		sizeinMB=0;
		
	}
	public eBook(int id, String title, float price,String d,double s) 
	{
		super(id, title, price);
		downUrl=d;
		sizeinMB=s;
	}
	
	public String getDownUrl() {
		return downUrl;
	}
	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}
	public double getSizeinMB() {
		return sizeinMB;
	}
	public void setSizeinMB(double sizeinMB) {
		this.sizeinMB = sizeinMB;
	}
	public void Display()
	{
		super.Display();
		System.out.println("Download url: "+getDownUrl());
		System.out.println("Size in MB: "+getSizeinMB());
	}
	
	
	
	

}
