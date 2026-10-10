package printer;

public class PrinterDemo {

	public static void main(String[] args) {
		Printer printer =new Printer();
		PrinterThread t1= new PrinterThread(printer,"Welcome");
		PrinterThread t2= new PrinterThread(printer,"to");
		PrinterThread t3= new PrinterThread(printer,"Cdac");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
