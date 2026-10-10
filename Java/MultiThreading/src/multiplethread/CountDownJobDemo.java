package multiplethread;

public class CountDownJobDemo {

	public static void main(String[] args) {
		CountDownJob j1 =new CountDownJob("First: " ,8);
		CountDownJob j2 =new CountDownJob("Second: " ,2);
		CountDownJob j3 =new CountDownJob("Third: " ,4);
		
		System.out.println("Counting down task begins ....");
		//Runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Counting down task ends ......");
	}

}
