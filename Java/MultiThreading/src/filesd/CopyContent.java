package filesd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CopyContent {

	public static void main(String[] args) throws Exception {
		BufferedReader br= null;
		
		br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Source file name : ");
		String source = br.readLine();
            
        System.out.println("Enter Destination file name : ");
        String destination = br.readLine();
        
        FileCopyThread t= new FileCopyThread(source,destination);
        t.start();
        t.join();
        
	}
}
