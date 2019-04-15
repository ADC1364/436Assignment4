package resturant;

import java.util.Iterator;

public class SystemInterface {
	
	private static Invoker inv;
	
	public static void init (Invoker newInv) { inv = newInv; }

	public static String [] getMenu() {
		
		Menu menu = inv.getMenu();
		
		Iterator<MenuItem> itr = menu.getIterator();
		
		
		String [] menuItems = new String [menu.menuSize()];
		
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
		
		Tab currentTab = inv.getTab();
		
		Iterator <MenuItem> itr = currentTab.getIterator();
		
		
		String [] tabItems = new String [currentTab.tabSize() + 1];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			MenuItem item = (MenuItem) itr.next();
			
			tabItems[index] = item.toString();
			index ++;
		}
		
		tabItems[tabItems.length-1] = "Your total is: $ " + currentTab.getSum();
		
		return tabItems;
	}

}
