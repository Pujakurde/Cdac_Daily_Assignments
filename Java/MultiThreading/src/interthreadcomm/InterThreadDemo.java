package interthreadcomm;

public class InterThreadDemo {
	public static void main(String[] args) {
		//shared resource
		Stock s = new Stock();
				
		//2 threads
		//newly created
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
				
		//runnable
		p.getT().start();
		c.getT().start();
				
		try {
			Thread.sleep(500);   //producer and consumer will get a chance to run
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p.setbRun(false);
		c.setbRun(false);
				
				//main thread waits till producer and consumer actually finish
		try {
			p.getT().join();
			c.getT().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println("Alive : "+p.getT().isAlive());
		System.out.println("Alive : "+c.getT().isAlive());
				
				
		System.out.println("Qty Produced : "+s.getQtyProduced());
		System.out.println("Qty Consumed : "+s.getQtyConsumed());
				

	}

}
