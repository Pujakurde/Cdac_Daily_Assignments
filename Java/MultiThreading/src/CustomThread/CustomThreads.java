
public class CustomThreads extends Thread {
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
		CustomThreads c = new CustomThreads();
		c.run();
	}
}
