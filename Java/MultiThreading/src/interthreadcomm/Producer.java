package interthreadcomm;

public class Producer implements Runnable {
	private Thread t;
	private Stock s;
	private boolean bRun;
	
	public Producer(Stock s) {
		//super();
		this.t=new Thread(this);
		this.s = s;
		this.bRun = true;
	}


	public void run() {
		while(bRun) {
			s.produced();
		}
		
	}


	public Thread getT() {
		return t;
	}


	public void setbRun(boolean bRun) {
		this.bRun = bRun;
	}
	

}

