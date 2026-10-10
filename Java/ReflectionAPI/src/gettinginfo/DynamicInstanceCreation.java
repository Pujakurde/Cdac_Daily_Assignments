package gettinginfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

import javax.swing.tree.FixedHeightLayoutCache;
public class DynamicInstanceCreation {

	public static void main(String [] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter fully qualified name of the class : ");
		String cname = br.readLine(); 
		
		Class c = Class.forName(cname);
		
		Constructor con = c.getConstructor(char[].class, int.class, int.class);
		
		char [] chars = {'w','e','l','c','o','m','e'};
		
		Object obj = con.newInstance(chars,2,5);
		
		String str = (String)obj;
		
		System.out.println(str);    
		
		System.out.println("Enter the method name : ");
		String mname = br.readLine();
		Method m = c.getMethod(mname,null);
		System.out.println(m.invoke(obj,null));
		
		/*Method m = c.getMethod(mname, String.class);
		System.out.println(m.invoke(obj, "come"));  */        
		

		
	}

}
