package resturant;

import java.util.ArrayList;
import java.util.List;

public class Orders {
	
	private List<OrderItem> orders = new ArrayList<OrderItem>();

	public Orders() { }
	
	public void addOrder (OrderItem newItem) { orders.add(newItem);}
	
	public void removeOrder (OrderItem newItem) { orders.remove(newItem); }
	
	public java.util.Iterator<OrderItem> getIterator () { return orders.iterator(); }

}
