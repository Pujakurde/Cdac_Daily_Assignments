package printer;

public class Printer {
	public synchronized void printing(String data) {
		System.out.println("Priniting: "+data);
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Finished: "+data);
	}
}
