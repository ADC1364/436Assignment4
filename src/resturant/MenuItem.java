package resturant;

public class MenuItem {
	
	private int menuItemNum;
	private String name;
	private double price;

	public MenuItem(int itemNum, String name, double price) {
		menuItemNum = itemNum;
		this.name = name;
		if(price >= 0)
			this.price = price;
		else
			this.price = 0;
	}
	
	// copy constructor
	public MenuItem(MenuItem otherItem) {
		menuItemNum = otherItem.menuItemNum;
		this.name = otherItem.name;
		this.price = otherItem.price;
	}
	
	public int getItemNum () { return this.menuItemNum; }
			
	public String getName () { return this.name; }
		
	public double getPrice () { return this.price; }
	
	public String toString () { return menuItemNum + " " +  name + " $ " + price;}
}
