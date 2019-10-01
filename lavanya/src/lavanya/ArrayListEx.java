package lavanya;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayListEx {

	public static void main(String args[]) {

		Map< Integer, String> m = new HashMap<>();
		m.put(1, "lovely");
		m.put(2, "teju");
		m.put(3, "vinu");
		System.out.println(m);
		
		for( Integer k: m.keySet()) {
			System.out.println(k +" "+m.get(k));
		}
		
	
		
			}

}
