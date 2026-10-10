
public class CustomThreadRunnable implements Runnable {

	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Runnable r=new CustomThreadRunnable();
		r.run();
	}

}
