package resturant;

import java.util.Iterator;

public class CMDSubmitOrder implements Command {
	
	private Orders submittedOrder;

	public CMDSubmitOrder( Aggregator aggr, int menuItemOrdered) { 
		
		Iterator menuItr = aggr.getMenu().getIterator();
		
		submittedOrder =  aggr.getOrder();
		
		while(menuItr.hasNext()) {
			
			MenuItem current = new MenuItem( (MenuItem) menuItr.next());
			
			if(current.getItemNum() == menuItemOrdered)
				submittedOrder.addOrder(new OrderItem(menuItemOrdered));
		}
		
	}

	@Override
	public Object execute() { return submittedOrder; }

}
