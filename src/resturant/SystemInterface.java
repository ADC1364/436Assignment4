package resturant;

import java.util.Iterator;

public class SystemInterface {
	
	private static Invoker inv;
	
	public static void init (Invoker newInv) { inv = newInv; }

	public static String [] getMenu() {
		
		Iterator itr = inv.getMenu().getIterator();
		
		
		String [] menuItems = new String [inv.getMenu().menuSize()];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			MenuItem item = (MenuItem) itr.next();
			
			menuItems[index] = item.toString();
			index ++;
		}
		
		return menuItems;
	}
	
	public static boolean placeOrder(int itemOrdered) {
		
		
		Orders newOrders = inv.placeOrder(itemOrdered);
		
		Iterator itr = newOrders.getIterator();
		
		while(itr.hasNext()) {
			
			OrderItem current = new OrderItem( (OrderItem) itr.next() );
			
			if(current.getItemNum() == itemOrdered)
				return true;
		}
		
		return false;
		
	}
	
	public static String [] getOrders(int itemNum) {
		
		Orders order = inv.placeOrder(itemNum);
		
		Iterator itr = order.getIterator();
		
		
		String [] menuItems = new String [order.orderSize()];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			OrderItem item = (OrderItem) itr.next();
			
			menuItems[index] = item.getItemNum() + "";
			index ++;
		}
		
		return menuItems;
	}
	
	
	
	public static String [] getTab() {
		
		Iterator itr = inv.getTab().getIterator();
		
		
		String [] tabItems = new String [inv.getTab().tabSize()];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			MenuItem item = (MenuItem) itr.next();
			
			tabItems[index] = item.toString();
			index ++;
		}
		
		return tabItems;
	}

}
