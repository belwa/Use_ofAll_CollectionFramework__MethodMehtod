package CollectionPractice.com;

import java.util.HashSet;
import java.util.Iterator;

/*
public class HashSet1 {

	public static void main(String[] args) {
		HashSet <String> set = new HashSet<>();
		
		// Adding the element of HashSet
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Apple"); // they will not allowed the duplicate elements
		
		// Display the HashSet
		System.out.println("HashSet: "+ set);

// check if an element is present


// remove the element of HashSet
set.remove("Orange");
System.out.println("After removing the element: "+ set);      
	
// Get the size of the set
System.out.println("Is the set Empty? "+ set.isEmpty());

// Clear the set
set.clear();
System.out.println("HashSet After the clear: "+ set);

}

}
*/

//===============================================================================================================================================================

// Q2 useOfTheIterator
/*
public class   HashSet1 {
	
	public static void main (String[] args) {
		// Create the HashSet of the String
		HashSet <String> set = new HashSet<>();
		
		// Add the elements to the set
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Mango");
		
		// Create the iterator for the HashSet
		Iterator <String> iterator = set.iterator();
		
		// Use the iterator to itrrate through the set
		System.out.println("Iterating over the HashSet using Iterator: ");
		while(iterator.hasNext()) {
			// Get the next element
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		
		// Example of uinsg remove() with Iterator
		 iterator = set.iterator(); 
		 while(iterator.hasNext()) {
			 String fruit =  iterator.next();
			 if(fruit.equals("Banana")) {
				 // Remove the while iterating
				 iterator.remove();
			 }
		 }
		 
		 // Print the HashSet after removing an element
		 System.out.println("HashSet after removing 'Banana: "+ set);
	}
}
*/

		
		
		
         


