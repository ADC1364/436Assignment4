package resturant;

import java.util.Iterator;

public class CMDGetTab implements Command {
	
	private Tab tab;

	public CMDGetTab( Aggregator aggr) { this.tab = new Tab(aggr); }

	@Override
	public Object execute() { return tab;}

}
