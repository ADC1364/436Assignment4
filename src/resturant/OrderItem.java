package resturant;

public class OrderItem {
	
	private int orderItemNum;

	public OrderItem(int orderItemNum) {
		this.orderItemNum = orderItemNum;
	}
	
	// copy constructor
	public OrderItem(OrderItem otherItem) {
		
		this.orderItemNum = otherItem.orderItemNum;
	}

	public int getItemNum () { return this.orderItemNum; }
}
