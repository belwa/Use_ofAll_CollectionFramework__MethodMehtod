package CollectionPractice.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {

	public static void main(String[] args) {
		// Create a Deque using ArrayDeque
		Deque <String> deque = new ArrayDeque();
		
		// 1 Add the element of the deque
		 deque.add("Apple");
		 deque.add("Banana");
		 deque.add("Orange");
		 deque.add("Grapes");
		 
		 // Display the Queue element
		 System.out.println("Deque after adds: "+  deque );
		 
		 // Offer the element to the deque(Non Blocking)
		 deque.offer("Element4"); // adds the end of the
		 deque.offerFirst("Element5"); // add the deque of end of the value
		 deque.offerLast("Element 6"); // adds the end
		 
		 System.out.println("Deque after offers: "+ deque);
		 
		 // peek() elements (wihtout retriving)
		 System.out.println("first element (peekFirst): "+ deque.peekFirst());
		 System.out.println("first element (peeklAST): "+ deque.peekLast());
		 
		 // Remove the element of the deque
		 System.out.println("Removed the first (lement): "+ deque.removeFirst());
		 System.out.println("Removed the first (lement): "+ deque.removeLast());
		 
		 // Poll element of the dequeue(retirves and removes, return null if empty)
		 System.out.println("poll the element of the (pollFirst) :" + deque.pollFirst());
		 System.out.println("poll last elemnet (pollLast): "+ deque.pollLast());
		 
		 // check the size of the deque
		 System.out.println("Deque size: "+ deque.size());
		 
		 // check is the dequeu is empty: 
		 System.out.println("Is the deque is empty: "+ deque.isEmpty());
		 
		 // Check is element exists in deque
		 System.out.println("Does Element 4 exists ? " + deque.contains("Element 4") );
		 
		 // Remove an element explicity
		 deque.add("Element 7");
		 deque.remove("Element 7");
		 System.out.println("Deque After: removing the Element: "+ deque);
		 
		

	}

}
