
public class DefaultPriority {
	public static void main(String[] arg) {
		//Default thread main
		//garbage collector 
		Thread t=Thread.currentThread();
		System.out.println("Name: "+t.getName());
		System.out.println("Priority: "+t.getPriority());
		
		
	}

}
