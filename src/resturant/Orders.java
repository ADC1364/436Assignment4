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
	
	/*public ResturantIterator getIterator () { return new AllItemsIterator(); }
	
	private class AllItemsIterator implements ResturantIterator {
		
		private int index = 0;
		
		public AllItemsIterator() { }
		
		public boolean hasNext() {
			return orders.size() - 1 == index;
		}
		
		public OrderItem next() {
			
			if(!hasNext())
				return null;
			OrderItem item = orders.get(index);
			index ++;
			return item;
		}
	}*/
	
	public Iterator getIterator() { return orders.iterator();}

}
