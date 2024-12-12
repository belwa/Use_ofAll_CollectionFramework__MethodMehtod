
package CollectionPractice.com;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	// add(E,e)= adds the element to the list
	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Guavava");
		list.add("Mango");
		
		System.out.println(list);
		
	// get(int index) = retrive the element from the list of index
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		
	// set(	int index, element) = replace the element at the specific index with specified element
		list.set(2, "Sunny");
		list.set(3, "Vishal");
		
		System.out.println("After replace of th element: "+ list);
		
    // remove(int index) = remove the element from the list of index
		list.remove(2);
		System.out.println("After remove the element: "+ list);
		
	// size()= return the number of the element in the index
		System.out.println(list.size());
		
	// Contains()= check if the element exist in the element
	     System.out.println(list.contains("Vishal"));
	     
	// isEmpty()= check if the list is empty the value is exists return true otherwise false
	     System.out.println(list.isEmpty());
	  
	     /*
	// clear()= clear the list by removing all the element 
	     list.clear();
	     System.out.println(list);
	     
	   */
	     
	 // toArray() = Convert the list to an array
	     /*
	     Object [] array = list.toArray();
	     System.out.println(Arrays.toString(array))
	     */
	     
	     
	     
		
	

	}

}
