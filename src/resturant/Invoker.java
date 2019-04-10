package resturant;

public class Invoker {
	
	private Aggregator inAggr;

	public Invoker(Aggregator newAggr) {
		this.inAggr = newAggr;
	}
	
	public Menu getMenu() { return (Menu) new CMDGetMenu(inAggr).execute(); }

}
