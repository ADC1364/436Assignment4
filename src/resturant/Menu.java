package resturant;

import java.util.*;
import java.util.Iterator;

// need a clone method or copy method to pass a copy with the CMDGetMenu object.

public class Menu {
	
	private List<MenuItem> menu = new ArrayList<MenuItem>();
	
	
	public Menu() { }
	
	public int menuSize() {return menu.size();}
	
	public void addItem (MenuItem newItem) { menu.add(newItem);}
	
	public void removeOrder (OrderItem newItem) { menu.remove(newItem); }
	
	public Iterator getIterator () { return  menu.iterator(); }

}
