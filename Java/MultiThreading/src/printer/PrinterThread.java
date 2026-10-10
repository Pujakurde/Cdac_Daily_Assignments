package printer;

public class PrinterThread extends Thread {
	private Printer printer;
	private String data;
	
	
	public PrinterThread(Printer printer, String data) {
		super();
		this.printer = printer;
		this.data = data;
	}

	public void run() {
		printer.printing(data);
	}
	
	
	
	

}
