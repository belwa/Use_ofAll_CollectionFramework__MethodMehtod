package CollectionPractice.com;
import java.util.ArrayList;


/*
add(E e): Adds an element to the list.
get(int index): Retrieves the element at the specified index.
remove(Object o): Removes the first occurrence of the specified element.
size(): Returns the number of elements in the list.
contains(Object o): Checks if the list contains the specified element.
isEmpty(): Checks if the list is empty.
clear(): Removes all elements from the list.
This demonstrates basic operations that can be performed using the ArrayList class in Java.
*/

public class ArrayList1 {

	public static void main(String[] args) {
		// Crate a ArrayList to store the integer
		ArrayList <Integer> list = new ArrayList<>();
		
		// add(E,e)= add an element to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		// print the ArrayList
		System.out.println("print the arrayList: "+ list);
		
		// Acces the element using get() method
		System.out.println("Element at index 2: "+ list.get(2));
		
		// Remove the element of using remove() method
		list.remove(Integer.valueOf(20)); // Removes the element '20'
        System.out.println("After removing 20: " + list);
        
        // Get the sizeOf ArrayList using size()
        System.out.println("Size of arrayList "+ list.size());
        
        // check if the arrayList Contains a specific element using contains()
        System.out.println("Check of contains 40?:"+ list.contains(70));
        
        // Check if the ArrayList is empty using isEmpty() method
        System.out.println("check the arrayList empty?: "+ list.isEmpty());
        
        // Clear all the element if from the ArrayList using celar() method
        list.clear();
        System.out.println("After cleaning:"+ list);
        System.out.println(list);
        
		
		
		




		

	}

}
