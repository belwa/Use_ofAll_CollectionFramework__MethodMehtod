package CollectionPractice.com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {
	
	public static void main (String[] args) {
		ArrayList <String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Guavava");
		list.add("Date");
		
		// Get a ListIterator
		ListIterator listIterator = list.listIterator();
		
		// use of ListIterator traverse the forword direction
		System.out.println("Traverse the list forward");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		
			}
	
	   // get the previous directiom
		System.out.println("\n traverse the backword direction");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		// modifying the list
		System.out.println("\n modifying the data");
		    listIterator = list.listIterator();
		    while(listIterator.hasNext()) {
		    	  Object current = listIterator.next();
		    	  if(current.equals("Banana")) {
		    		  listIterator.set("Mangpo");
		    	  }
		    }
		    
	// Print the update the list
		    System.out.println("\n updated List: ");
		    for(String fruit: list) {
		    	System.out.println(fruit);
		    }
		    
		    
    // Add the element during itrtation
		    listIterator = list.listIterator();
		    listIterator.next();
		    listIterator.add("Vishal");
		    
		    
    // Add the element during iteration
		    System.out.println("\n after addding the Orange: ");
		    for(String fruits: list) {
		    	System.out.println(fruits);
		    }
	
	}
	
		
	}
	
