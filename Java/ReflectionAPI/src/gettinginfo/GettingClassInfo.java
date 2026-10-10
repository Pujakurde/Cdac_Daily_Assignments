package gettinginfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class GettingClassInfo {

	public static void main(String[] args) {
		try {
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter fully qualified name: ");
		String cname=br.readLine();
		
		//load into memory
		Class c1 =Class.forName(cname);
		String s1 = new String("welcome");
		//2
		Class c2 = s1.getClass();
		//3
		Class c3 = String.class;
		
		//use the methods of class Class 
		System.out.println("Package : "+c1.getPackageName());
		Class superclass  =  c1.getSuperclass();
		System.out.println("Super class : "+superclass);
		Class [] ifaces = c1.getInterfaces();
		System.out.println("Implemented interface.....");
		for(Class iface : ifaces) {
			System.out.println(iface);
		}
		System.out.println("Constrcutors.....");
		Constructor [] allcons = c1.getConstructors();
		for(Constructor cons : allcons)
			System.out.println(cons);
		System.out.println("Methods.......");
		//Method [] allmethods = c1.getMethods();  
		Method [] allmethods = c1.getDeclaredMethods();  
		for(Method method : allmethods)
			System.out.println(method);
		
		//n - combination
		int n = c1.getModifiers();
		if(Modifier.isAbstract(n))
			System.out.println("Class is abstract");
		else
			System.out.println("Class is not abstract");
		
		if(Modifier.isFinal(n))
			System.out.println("Class is final");
		
		if(Modifier.isPublic(n))
			System.out.println("Class is public");
			
		
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	

}

}
