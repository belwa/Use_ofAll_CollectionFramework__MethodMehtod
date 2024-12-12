package CollectionPractice.com;

import java.util.LinkedList;

public class linkLIst1 {

	public static void main(String[] args) {
		// Create the LinkList of the integer type
		LinkedList<Integer> list = new LinkedList<>();
		
		// Add the element to the LinkedList using Different methods'
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		// print the Adding the list of the elelemnt
		list.removeFirst(); // remove the first element
		System.out.println("LinkedList After Additions: "+ list);
		
		// Remove elements the LinkedList using different methods
		list.removeLast(); // remove the lastElement
		list.remove(1);   // remove the depend of the index
		
       System.out.println("Linked after removals: "+ list);
       
       // check if the list containd of specific element
       System.out.println("List contains 10? "+ list.contains(10));
       
       // Get the size of the linkList
       System.out.println("Size of the list: "+ list.size());
		
       
       // clear all the elements of the linkedlIst
       list.clear();
       System.out.println("Linked after the cleaning "+list);
       

	}

}
