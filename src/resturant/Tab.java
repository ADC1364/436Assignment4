package resturant;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tab {

	private List<MenuItem> tabItems = new ArrayList<MenuItem>();
	
	public Tab(Aggregator aggr) {
		
		Menu menu = new Menu(aggr.getMenu());
		Orders orders = new Orders( aggr.getOrder());
		
		for(Iterator menuItr = menu.getIterator(); menuItr.hasNext();) {
			MenuItem currentMenuItem = new MenuItem((MenuItem) menuItr.next());
			int count = 0;
			for(Iterator orderItr = orders.getIterator(); orderItr.hasNext();) {
				OrderItem currentOrderItem = new OrderItem( (OrderItem) orderItr.next() );
				
				if(currentMenuItem.getItemNum() == currentOrderItem.getItemNum())
					tabItems.add(currentMenuItem);
			}
		}
	}
	
	public int tabSize() { return tabItems.size();}
	
	public Iterator getIterator() { return tabItems.iterator();}

}
