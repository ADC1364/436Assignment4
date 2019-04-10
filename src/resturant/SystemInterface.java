package resturant;

public class SystemInterface {
	
	private static Invoker inv;
	
	public static void init (Invoker newInv) { inv = newInv; }

	public String [] getMenu() {
		
		Iterator itr = inv.getMenu().getIterator();
		String [] menuItems = new String [inv.getMenu().menuSize()];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			menuItems[index] = itr.toString(); 
		}
		
		return menuItems;
	}

}
