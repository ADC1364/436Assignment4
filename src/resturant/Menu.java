package resturant;

import java.util.*;
import java.util.Iterator;

// need a clone method or copy method to pass a copy with the CMDGetMenu object.

public class Menu {
	
	private List<MenuItem> menu = new ArrayList<MenuItem>();
	
	
	public Menu() { }
	
	// copy constructor
	public Menu (Menu otherMenu) { 
		
		for(MenuItem item : otherMenu.menu) {
			this.addItem(new MenuItem(item));
			
		}
	}
	
	public int menuSize() {return menu.size();}
	
	public void addItem (MenuItem newItem) { menu.add(newItem);}
	
	public void removeOrder (MenuItem newItem) { menu.remove(newItem); }
	
	/*public ResturantIterator getIterator () { return new AllItemsIterator(); }
	
	private class AllItemsIterator implements ResturantIterator {
		
		private int index = 0;
		
		public AllItemsIterator() { }
		
		public boolean hasNext() {
			return menu.size() - 1 == index;
		}
		
		public Object next() {
			
			if(!hasNext())
				return null;
			MenuItem item = menu.get(index);
			index ++;
			return item;
		}
	}
	*/
	
	public Iterator getIterator() { return menu.iterator();}

}
