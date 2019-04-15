package resturant;

import java.util.*;
import java.util.Iterator;



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
	
	public void removeItem (MenuItem newItem) { menu.remove(newItem); }
	
	public Iterator <MenuItem> getIterator() { return menu.iterator();}

}
