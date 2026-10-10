package interthreadcomm;

public class Stock {
	
	private int qtyProduced;
	private int qtyConsumed;
	private boolean bProduced;
	
	public Stock() {
		super();
		qtyProduced = qtyConsumed = 0;
		bProduced = false;
	}
	
	/*public void produced() {
		while(bProduced) {
			qtyProduced++;
			System.out.println("Quantity produced: "+qtyProduced);
			bProduced=true;
		}
	}
	
	public void consumed() {
		while(!bProduced) {
			qtyConsumed++;
			System.out.println("Quantity Consumed: "+qtyConsumed);
			bProduced=false;
		}
	}*/
	public synchronized void produced() {
		if(bProduced) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyProduced++;
		System.out.println("Quantity produced: "+qtyProduced);
		bProduced=true;
		notify();  //to consumer when producer finishes
		
	}
	public synchronized void consumed() {
		if(!bProduced) {
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		qtyConsumed++;
		System.out.println("Quantity Consumed: "+qtyConsumed);
		bProduced=false;
		notify();
		
	}
	public int getQtyProduced() {
		return qtyProduced;
	}
	
	public int getQtyConsumed() {
		return qtyConsumed;
	}

}
