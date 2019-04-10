package resturant;

public class OrderItem {
	
	private int orderItemNum;

	public OrderItem(int orderItemNum) {
		this.orderItemNum = orderItemNum;
	}

	public int getItemNum () { return this.orderItemNum; }
	
	public void setItemNum (int newOrderItemNum) { orderItemNum = newOrderItemNum; }
}
