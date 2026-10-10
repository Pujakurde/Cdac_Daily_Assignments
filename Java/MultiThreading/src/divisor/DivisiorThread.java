package divisor;

import java.io.FileWriter;
import java.io.IOException;

public class DivisiorThread extends Thread {
	private int number;
	private String fileName;
	
	
	public DivisiorThread(int number) {
		super();
		this.number = number;
	}
	public void run() {
		
		writeDivisors(number);
	}
	public synchronized void writeDivisors(int number) {
		System.out.println(Thread.currentThread().getName()+" is writing divisor of "+number);
		try {
			FileWriter fw=new FileWriter("divisor.txt",true);
			fw.write("Diviosr of: "+number +" are: ");
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					fw.write(i+" ");
				}
			}
			fw.write("\n");
			fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
