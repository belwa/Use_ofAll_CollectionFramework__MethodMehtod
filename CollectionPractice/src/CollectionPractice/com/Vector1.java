package CollectionPractice.com;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector <Integer> vector = new Vector<>();
		
		// add the element of the vector
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
	   // Display the vector after adding the element
		System.out.println("vector After adding the element: "+ vector);
		
	  // insert the element of specific palce
		vector.add(2, 34);
		System.out.println("insert the value of vector: "+ vector);
		
	// get(index) retrive the element of specific index
		int index = vector.get(3);
		System.out.println("the the element of specific point: "+index);
		
	// remove(index) remove the element of specific index
		 vector.remove(4);
		 System.out.println(" After remove the element of the value:"+vector );
		

	}

}
