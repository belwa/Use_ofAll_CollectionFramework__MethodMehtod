package CollectionPractice.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



// Q1 design a methdod which accept a collection and remove all the string type element from collection
/*
public class Iterator1 {
	
	public static void removeString(Collection collection) {
		
		Iterator itr =  collection.iterator();
		
		while(itr.hasNext()) {
			Object element = itr.next();
			if(element instanceof String) {
				itr.remove();
				
			}
		}
		
	}
	
	
	public static void main (String[] args) {
		Collection <Object> collection = new ArrayList<>();
		collection.add("Sunny");
		collection.add(123);
		collection.add(123.11);
		collection.add(45);
	    collection.add("Yadav");
	    
	    System.out.println("Before the remove the String: "+ collection);
	    
	       removeString(collection);
	       
	     System.out.println("After the remove the String: "+ collection);  
	    
	}
}
*/

//=================================================================================================================================================
// Q2 design a method which accept a colection and remove all the not String type form the emenent

/*
public class Iterator1 {
	
	public static void removingString(Collection collection1) {
		Iterator it = collection1.iterator();
		
		while(it.hasNext()) {
			Object element = it.next();
			if(!(element instanceof String)){
				it.remove();
			}
		}
		
	}
	
	public static void main (String[] args) {
		Collection <Object> collection1 = new ArrayList<>();
		collection1.add("Sunny");
		collection1.add(123);
		collection1.add(123.11);
		collection1.add(45);
	    collection1.add("Yadav");
		
	    System.out.println("Before the removing the String "+ collection1);
	    
	    removingString(collection1);
	    
	    System.out.println("After the removing the String: "+ collection1);
	}
}
*/

//=================================================================================================================================================
// Q3 Design a method which will remove all the interger for a collection
/*
public class Iterator1 {
	
	public static void removingString(Collection collection1) {
		Iterator it = collection1.iterator();
		
		while(it.hasNext()) {
			Object element = it.next();
			if(element instanceof Integer){
				it.remove();
			}
		}
		
	}
	
	public static void main (String[] args) {
		Collection <Object> collection1 = new ArrayList<>();
		collection1.add("Sunny");
		collection1.add(123);
		collection1.add(123.11);
		collection1.add(45);
	    collection1.add("Yadav");
		
	    System.out.println("Before the removing the String "+ collection1);
	    
	    removingString(collection1);
	    
	    System.out.println("After the removing the String: "+ collection1);
	}
}
*/

//===============================================================================================================================================
// Q4  Q3 Design a method which will not remove all the interger for a collection
/*
public class Iterator1 {
	
	public static void removingString(Collection collection1) {
		Iterator it = collection1.iterator();
		
		while(it.hasNext()) {
			Object element = it.next();
			if(!(element instanceof Integer)){
				it.remove();
			}
		}
		
	}
	
	public static void main (String[] args) {
		Collection <Object> collection1 = new ArrayList<>();
		collection1.add("Sunny");
		collection1.add(123);
		collection1.add(123.11);
		collection1.add(45);
	    collection1.add("Yadav");
		
	    System.out.println("Before the removing the String "+ collection1);
	    
	    removingString(collection1);
	    
	    System.out.println("After the removing the String: "+ collection1);
	}
}
*/

//================================================================================================================================================
// Q5 Design a method which which will count the integer element available in the collectipn
/*
public class Iterator1 {
	
	public static void removingString(Collection collection1) {
		Iterator it = collection1.iterator();
		
		int count = 0;
		while(it.hasNext()) {
			Object element = it.next();
			if(element instanceof Integer){
				count++;
				it.remove();
			}
		}
		System.out.println("print the count of the integer: "+ count);
		
	}
	
	public static void main (String[] args) {
		Collection <Object> collection1 = new ArrayList<>();
		collection1.add("Sunny");
		collection1.add(123);
		collection1.add(123.11);
		collection1.add(45);
	    collection1.add("Yadav");
		
	    
	    
	    removingString(collection1);
	    
	    
	}
}
*/

//===============================================================================================================================================

// Q6 design a method  which will count even integer number from a collection


/*
public class Iterator1 {
	
	public static void countEvenNumber(Collection collection) {
		Iterator itr = collection.iterator();
		
		int count = 0;
		
		while(itr.hasNext()) {
			Object element = itr.next();
			if(element instanceof Integer && (Integer) element%2 == 0) {
				count++;
			}
		}
		System.out.println("print the even number of the value: "+ count);
		
	}
	
	
		
		
	
	public static void main (String[] args) {
		// Create a collection and add elements
		Collection<Object> collection1 = new ArrayList<>();
		collection1.add("Sunny");
		collection1.add(123);
		collection1.add(123.11);
		collection1.add(45);
		collection1.add("Yadav");
		collection1.add(44);
		collection1.add(90);
		collection1.add(126);
		
		// Call the countEvenNumber method to count even numbers
		countEvenNumber(collection1);
	}
}
*/

//================================================================================================================================================
//Q7 design a method which will print the same of all the integer number from collection

/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {

    public static int addEvenNumber(Collection<Object> collection) {
        Iterator<Object> itr = collection.iterator();

        int sum = 0;
        while (itr.hasNext()) {
            Object element = itr.next();
            if (element instanceof Integer) {
                int number = (Integer) element;
                if (number % 2 == 0) {
                    sum += number;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a collection and add elements
        Collection<Object> collection1 = new ArrayList<>();
        collection1.add("Sunny");
        collection1.add(123);
        collection1.add(123.11);
        collection1.add(45);
        collection1.add("Yadav");
        collection1.add(44);
        collection1.add(90);
        collection1.add(126);

        // Call the addEvenNumber method and print the result
        int sum = addEvenNumber(collection1);
        System.out.println("Sum of even numbers: " + sum);
    }
}
*/

//===============================================================================================================================================

	
	


		
		 
