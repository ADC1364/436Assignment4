package resturant;

public class CMDGetMenu implements Command {
	
	 private Menu menu;
	
	 public CMDGetMenu( Aggregator aggr) {
		
		this.menu = aggr.getMenu();
	}

	@Override
	public Object execute() { return menu;}

}
