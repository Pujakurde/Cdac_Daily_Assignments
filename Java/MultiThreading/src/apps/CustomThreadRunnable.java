package apps;

//import com.sun.org.apache.xml.internal.utils.ThreadControllerWrapper.ThreadController;

public class CustomThreadRunnable implements Runnable {
	private Thread t;
	
	public CustomThreadRunnable() {
		t=new Thread(this);
			
	}
	
	
	public Thread getT() {
		return t;
	}


	public void setT(Thread t) {
		this.t = t;
	}


	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		CustomThreadRunnable tc=new CustomThreadRunnable();
		tc.getT().start();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		
	}

	
	

	
	

}
