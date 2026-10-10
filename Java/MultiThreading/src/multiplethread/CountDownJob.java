package multiplethread;

public class CountDownJob implements Runnable{
	private Thread t;
	private String name;
	private int num;

	public CountDownJob() {
		super();
		
	}

	public Thread getT() {
		return t;
	}

	public void setT(Thread t) {
		this.t = t;
	}

	public CountDownJob(String name, int num) {
		super();
		this.name = name;
		this.num = num;
		this.t = new Thread(this);
	}

	public void run() {
		while(num>0) {
			System.out.println(name+"Thread print"+num);
			num--;
		}
	}
}
