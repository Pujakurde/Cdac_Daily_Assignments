package copyContent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyContent {

	public static void main(String[] args) {
		BufferedReader br= null;
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Source file name : ");
            String source = br.readLine();
            
            System.out.println("Enter Destination file name : ");
            String destination = br.readLine();
            
            fr = new FileReader(source);

            fw = new FileWriter(destination);
          
            int ch;
            
            while ((ch = fr.read()) != -1) {
	         
	            fw.write(ch);
	           
	            }
           
            System.out.println("File copied successfully.");
            
            
            
			
		}
		catch(FileNotFoundException e) {
			System.err.println("File not found");
		    //e.printStackTrace();
		}
		
		catch (IOException e) {
            e.printStackTrace();
        }
		finally {
		    try {
		        if (br != null)
		            br.close();

		        if (fr != null)
		            fr.close();

		        if (fw != null)
		            fw.close();

		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		

	}

}
