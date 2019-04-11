package resturant;

public class CMDGetMenu implements Command {
	
	 private Menu menu;
	
	 public CMDGetMenu( Aggregator aggr) { this.menu = new Menu(aggr.getMenu()); }

	@Override
	public Object execute() { return menu;}

}
