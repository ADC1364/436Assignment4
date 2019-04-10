package resturant;

public class UserInterface {

	public static void main(String[] args) {
		
		Menu menu = getMenu();
		
		Aggregator agg = new Aggregator(menu, new Orders());
		
		Invoker inv = new Invoker(agg);
		
		SystemInterface.init(inv);
		
		System.out.println("The Menu at Five Guys is:");
		
		String [] items = SystemInterface.getMenu();
		
		for(int i = 0; i < items.length; i++) {
			
			System.out.println(items[i]);
		}

	}
	
	public static Menu getMenu () 
	{
		Menu newMenu = new Menu();
		
		newMenu.addItem(new MenuItem(1, "burger", 7.50));
		newMenu.addItem(new MenuItem(2, "fries", 3.50));
		newMenu.addItem(new MenuItem(3, "shake", 1.50));
		
		return newMenu;
	}

}
