package CollectionPractice.com;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		// Create the tree set and store the element
		TreeSet <Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(34);
		treeSet.add(17);
		treeSet.add(12);
		treeSet.add(12); // ignore them
		
		// display the element of the treeSet
		System.out.println("TreeSet: "+ treeSet);
		
		// Check the TreeSet Contains of the specific element
		boolean treeContains = treeSet.contains(10);
		System.out.println("10 contain of treeSet ?: "+ treeContains);
		
		// get the First element of the Tree Set
		int firstElement = treeSet.first();
		System.out.println("the first element of: "+ firstElement);
		
		// get the last element of the treeSet
		int lastElement = treeSet.last();
		System.out.println("the last element of TreeSet: "+ lastElement);
		
		// Get a subset of treeSet element strictly less than 15
		   TreeSet<Integer> subSet = (TreeSet<Integer>) treeSet.headSet(15);
	        System.out.println("Subset less than 15: " + subSet);
	        
	   // get the size of element of TreeSet
	        System.out.println("Tree set of the element of the size: "+ treeSet.size());
	        
	   // get the clear of the elemet of the treeSet
	        treeSet.clear();
	        System.out.println("the clear of the lement : "+ treeSet);
	        
		
 		

	}

}
