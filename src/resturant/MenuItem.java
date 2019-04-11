package resturant;

public class MenuItem {
	
	private int menuItemNum;
	private String name;
	private double price;

	public MenuItem(int itemNum, String name, double price) {
		menuItemNum = itemNum;
		this.name = name;
		this.price = price;
	}
	
	// copy constructor
	public MenuItem(MenuItem otherItem) {
		menuItemNum = otherItem.menuItemNum;
		this.name = otherItem.name;
		this.price = otherItem.price;
	}
	
	// getter and setter methods for name field
	public int getItemNum () { return this.menuItemNum; }
			
	public void setName (int newItemNum) { menuItemNum = newItemNum; }
	
	// getter and setter methods for name field
	public String getName () { return this.name; }
		
	public void setName (String newName) { name = newName; }
		
	// getter and setter methods for price field
	public double getPrice () { return this.price; }
				
	public void setName (double newPrice) { price = newPrice; }
	
	public String toString () { return menuItemNum + " " +  name + " $" + price;}
}
