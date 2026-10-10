package order;

public class Order {
	private int orderID;
	private String custname;
	private double amount;
	OrderStatus status;
	
	
	
	public Order(int orderID, String customerName,
			double amount, OrderStatus status) {
			this.orderID = orderID;
			this.custname = customerName;
			this.amount = amount;
			this.status = status;
			//this.status = OrderStatus.PLACED
	}
	
	public void changeStatus(OrderStatus status) {
		this.status=status;
		
	}



	public String toString() {
		return "Order ID : " + orderID +
		", Customer Name : " + custname +
		", Amount : " + amount +
		", Status : " + status;
		}
	
	

}
