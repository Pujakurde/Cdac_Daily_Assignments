package generiClass;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass <Integer> o1= new MyClass();
		o1.setValue(45);
		System.out.println(o1.getValue() * o1.getValue());
		
		MyClass <String> o2= new MyClass();
		o2.setValue("Hello");
		System.out.println(o2.getValue().toUpperCase());
		
		 

	}

}
