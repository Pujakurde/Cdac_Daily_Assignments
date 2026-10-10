package order;

public enum OrderStatus {
	PLACED(10),CONFIRMED(20),SHIPPED(30),DELIVERED(40),CANCELLED(50);
	
	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}
	

}
