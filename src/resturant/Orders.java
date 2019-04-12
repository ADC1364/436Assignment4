package resturant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Orders {
	
	private List<OrderItem> orders = new ArrayList<OrderItem>();

	public Orders() { }
	
	public Orders (Orders otherOrders) { 
		for(OrderItem item : otherOrders.orders) {
			this.addOrder( new OrderItem(item));
			
		}
	} 
	
	public void addOrder (OrderItem newItem) { orders.add(newItem);}
	
	public void removeOrder (OrderItem newItem) { orders.remove(newItem); }
	
	public int orderSize() {return orders.size(); }
	
	public Iterator<OrderItem> getIterator() { return orders.iterator();}
	
	

}
