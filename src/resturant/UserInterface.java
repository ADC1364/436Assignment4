package resturant;

import java.util.Scanner;

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
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the item number you wish to order: ");
		int orderNum = input.nextInt();
		
		
		boolean placed = SystemInterface.placeOrder(orderNum);
		
		if(placed)
			System.out.println("Your order has been placed");
		else
			System.out.println("Error occured");
		
		System.out.println("Your tab is: ");
		
		/*String [] orders = SystemInterface.getOrders(orderNum);
		
		for(int i = 0; i < orders.length; i++) {
			
			System.out.println(orders[i]);
		}
		*/
		
		
		
		
		String [] tab = SystemInterface.getTab();
		
		for(int i = 0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
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
