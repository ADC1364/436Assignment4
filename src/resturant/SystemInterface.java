package resturant;

import java.util.Iterator;

public class SystemInterface {
	
	private static Invoker inv;
	
	public static void init (Invoker newInv) { inv = newInv; }

	public static String [] getMenu() {
		
		Iterator<MenuItem> itr = inv.getMenu().getIterator();
		
		
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
		
		Iterator<OrderItem> itr = newOrders.getIterator();
		
		while(itr.hasNext()) {
			
			OrderItem current = new OrderItem( (OrderItem) itr.next() );
			
			if(current.getItemNum() == itemOrdered)
				return true;
		}
		
		return false;
		
	}
	
	public static String [] getTab() {
		
		Iterator <MenuItem> itr = inv.getTab().getIterator();
		
		
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
