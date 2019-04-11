package resturant;

public class Invoker {
	
	private Aggregator inAggr;

	public Invoker(Aggregator newAggr) {
		this.inAggr = newAggr;
	}
	
	public Menu getMenu() { return (Menu) new CMDGetMenu(inAggr).execute(); }
	
	// accepts orderedItem as a parameter 
	public Orders placeOrder( int orderedItem) { return (Orders) new CMDSubmitOrder(inAggr, orderedItem).execute(); }
	
	public Tab getTab() { return (Tab) new CMDGetTab(inAggr).execute(); }

}
