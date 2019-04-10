package resturant;
import java.util.Iterator;

public class SystemInterface {
	
	private static Invoker inv;
	
	public static void init (Invoker newInv) { inv = newInv; }

	public static String [] getMenu() {
		
		Iterator itr = inv.getMenu().getIterator();
		String [] menuItems = new String [inv.getMenu().menuSize()];
		
		int index = 0;
		
		while(itr.hasNext()) {
			
			menuItems[index] = itr.next().toString();
			index ++;
		}
		
		return menuItems;
	}

}
