package divisor;

import java.io.File;

public class DivisiorDemo {

	public static void main(String[] args) {
		DivisiorThread t1=new DivisiorThread(32);
		t1.start();
		DivisiorThread t2= new DivisiorThread(30);
		t2.start();
		DivisiorThread t3=new DivisiorThread(50);
		t3.start();
		String filename="divisor.txt";
		System.out.println("File created successfully.\nCreated at: "+new File(filename).getAbsolutePath());

	}

}
