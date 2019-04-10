package resturant;


public class Aggregator {
	
	private Menu resturantMenu = new Menu();
	private Orders resturantOrder = new Orders();

	public Aggregator(Menu newMenu, Orders newOrders) {
		this.resturantMenu = newMenu;
		this.resturantOrder = newOrders;
		
	}
	
	public Menu getMenu () { return this.resturantMenu; }
	
	public Orders getOrder () { return this.resturantOrder; }
	

}
