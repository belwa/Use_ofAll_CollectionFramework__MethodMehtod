package CollectionPractice.com;

import java.util.LinkedHashSet;

public class LinkHashSet1 {

	public static void main(String[] args) {
	
		// Create the LinkedHashSet
		LinkedHashSet <String> linkHashSet = new LinkedHashSet<>();
		 linkHashSet.add("Apple");
		 linkHashSet.add("Banana");
		 linkHashSet.add("Orange");
		 linkHashSet.add("cherry");
		 
		 // Attempt to add the duplicate the elemenet(not added the element
		 System.out.println("LinkedHashSet: "+  linkHashSet);
		 
		 // Checking if an element is present using contains() method
		 boolean containsBanana =  linkHashSet.contains("Banana");
		 System.out.println("Contains Banana: "+ containsBanana);
		 
		 // Removing the element using remove() method
		 linkHashSet.remove("Cherry");
		 
		 
		 
		 System.out.println("After removing the element:"+  linkHashSet);
		 
		 // Checking the size of the LinkedHashSet using size() method
		 System.out.println("Size of LinkedHashSet: "+  linkHashSet.size());
		 
		 // Checking the linkHashSet is empty or not use of isEmpty()
		 boolean isEmptys =  linkHashSet.isEmpty();
		 System.out.println("IS the LinkedHashSet empty ? "+ isEmptys);
		 
		 // Clearing all the elements using clear() method
		 linkHashSet.clear();
		 System.out.println("After the cleaning LinkHAshSet: "+  linkHashSet);
		 
		 
 
	}

}
