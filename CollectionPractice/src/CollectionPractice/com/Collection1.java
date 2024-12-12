package CollectionPractice.com;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// Create a coolection using the list
	      Collection <String> collection = new ArrayList<>();
	      
	      // Add element ot the collections
	      collection.add("Apple");
	      collection.add("Orange");
	      collection.add("Banana");
	      collection.add("guavava");
	      collection.add("lichi");
	      
	      // Print the size of the collection
	      System.out.println("the size of collection: "+ collection.size());
	      
	      // check if the element is present
	      if(collection.contains("Banana")) {
	    	  System.out.println("banana present in the collection");
	      }
	      
	      // Remove the element of the collection
	      collection.remove("Orange");
	      System.out.println("remove after the collection:"+ collection);
	      
	      // check the collection isEmpty()) or not
	      if(!collection.isEmpty()) {
	    	  System.out.println("the collection is not emptY: ");
	      }
	      
	      // use the toArray() convert collection to the String
	          collection.toArray();
	          System.out.println("print the collection convert array: "+ collection.toString());
	      
	      

	}

}
