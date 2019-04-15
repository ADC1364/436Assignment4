package resturant;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Menu menu = createMenu();
		
		Aggregator agg = new Aggregator(menu, new Orders());
		
		Invoker inv = new Invoker(agg);
		
		SystemInterface.init(inv);
		
		System.out.println("The Menu at the Diner is:");
		
		String [] items = SystemInterface.getMenu();
		
		printItems(items);
		
		Scanner input = new Scanner(System.in);
		
		createOrder(menu, input);
		
		System.out.println("Your tab is: ");
		
		String [] tab = SystemInterface.getTab();
		
		printItems(tab);
		

	}

	/**
	 * @param menu
	 * @param input
	 */
	public static void createOrder(Menu menu, Scanner input) {
		int orderNum;
		do {
		System.out.println("Please Enter the item number you wish to order: ");
		orderNum = input.nextInt();
		
		boolean placed = SystemInterface.placeOrder(orderNum);
		
		if(placed)
			System.out.println("Your order has been placed");
		
		} while(orderNum > 0 && orderNum <= menu.menuSize());
	}

	/**
	 * @param items
	 */
	public static void printItems(String[] items) {
		for(int i = 0; i < items.length; i++) {
			
			System.out.println(items[i]);
		}
	}
	
	public static Menu createMenu () 
	{
		Menu newMenu = new Menu();
		
		newMenu.addItem(new MenuItem(1, "burger", 7.50));
		newMenu.addItem(new MenuItem(2, "fries", 3.50));
		newMenu.addItem(new MenuItem(3, "shake", 1.50));
		
		newMenu.addItem(new MenuItem(4, "cookie", 2.50));
		newMenu.addItem(new MenuItem(5, "pizza", 3.50));
		newMenu.addItem(new MenuItem(6, "soda", 1.50));
		
		return newMenu;
	}

}
