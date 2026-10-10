package interthreadcomm;

public class Consumer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	
	public Consumer(Stock s) {
		//super();
		this.t=new Thread(this);
		this.s = s;
		this.bRun = true;
	}


	public void run() {
		while(bRun) {
			s.consumed();
		}
		
	}


	public Thread getT() {
		return t;
	}


	public void setbRun(boolean bRun) {
		this.bRun = bRun;
	}
	

}
