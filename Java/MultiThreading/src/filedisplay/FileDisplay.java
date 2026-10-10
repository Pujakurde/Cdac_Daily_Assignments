package filedisplay;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay implements Runnable {
	private Thread t;
	private String path;

	public FileDisplay(String path) {
		super();
		t = new Thread(this);
		this.path = path;
	}
	
	//modified to add synchronization
	public synchronized void run() {
		File file=new File(path);
		System.out.println("File path: "+file.getAbsolutePath());
		System.out.println("Size: "+file.length());
		System.out.println("readable"+file.canRead());
		FileReader fr = null;
		try {			
			if(file.canRead()) {
				fr = new FileReader(file);
				int i;
				while( (i = fr.read()) != -1) 
					System.out.print((char)i);
				System.out.println("**************************");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public Thread getT() {
		return t;
	}
	
	

}
		
		

