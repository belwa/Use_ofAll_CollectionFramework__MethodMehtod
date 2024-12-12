package CollectionPractice.com;

import java.util.HashMap;
import java.util.Map;


public class Map1 {

	public static void main(String[] args) {
		Map <Integer, String> map = new HashMap<>();
		
		// 1. add key value pair
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "four");
		map.put(5, "Five");
		
		// Display of the map of the value
		System.out.println("the map key value is: "+ map);
		
		// 2. size() - Get the numbers of the entries
		System.out.println("Size of the map: "+ map.size());
		
		// containsValue()- check if the value exists
		System.out.println("Contain value Two ?:"+ map.containsValue("Two"));
		
		// get() Get the value of specific key
		System.out.println("Value for key 4: "+ map.get(4));
		
		// remove()- remove the key_value pair
		map.remove(2);
		System.out.println("remove the key after removr: "+ map);
		
		// isEmpty() check is map is empty or not
		System.out.println("Is map Empty ?: "+ map.values());
		
		// keySet() get all the key in the map
		System.out.println("All keys: "+ map.keySet());
		
		// value() Get All the value in the map
		System.out.println("All the values: "+ map.values());
		
		// entrySet() Get all the key Value pair (as a set of Map.Entry)
		System.out.println("All entrires: "+ map.entrySet());
		
		// putAll() add all entries from another map
		Map<Integer, String> anotherMap = new HashMap<>();
		anotherMap.put(6, "six");
	    anotherMap.put(7, "Seven");
		map.putAll(anotherMap);
		System.out.println("After putAll form anotherMap: "+ map);
		
		// 12.clear()
		System.out.println("After clear , map is: "+ map);
		
 		
 
		

	}

}
