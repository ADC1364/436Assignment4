package resturant;

import java.util.*;


public class Menu {
	
	private List<MenuItem> menu = new ArrayList<MenuItem>();
	
	
	public Menu() { }
	
	public int menuSize() {return menu.size();}
	
	public void addItem (MenuItem newItem) { menu.add(newItem);}
	
	public void removeOrder (OrderItem newItem) { menu.remove(newItem); }
	
	public Iterator getIterator () { return (Iterator) menu.iterator(); }

}
