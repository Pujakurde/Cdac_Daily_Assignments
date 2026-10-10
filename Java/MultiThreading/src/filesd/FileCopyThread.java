package filesd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyThread extends Thread {
	String source,destination;

	public FileCopyThread(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			FileInputStream fis=new FileInputStream (source);
			FileOutputStream fos=new FileOutputStream (destination);
		
		    
		    int ch;
		    
		    while ((ch = fis.read()) != -1) {
		     
		        fos.write(ch);
		       
		        }
		    	fis.close();
		    	fos.close();
		   
		    System.out.println("File copied successfully.");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
