package Library;

public class Test {

	public static void main(String[] args) {
		PaperBook p=new PaperBook(55, "C prog",500.55f,5,new Date(12,10,2004));
		p.Display();
		eBook e=new eBook(101, "OOPS in CPP", 200.0f,"www.zlib.com",75.22);
		e.Display();
		
	}

}
