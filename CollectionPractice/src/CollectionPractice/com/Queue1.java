package CollectionPractice.com;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
	// Create the queue using LinkedList
		Queue <Integer> queue = new LinkedList<>();
		
   // Using the add() to insert element into the queue
		System.out.println("Using add() to insert elements");
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Queue after add() "+ queue);
		
   // Using offer()	to insert elements into the queue
		System.out.println("\n Using offer() to insert the elements:");
		queue.offer(40);
		queue.offer(50);
		System.out.println("Queue after offer() "+ queue);
		
   // Using remove() to retrive and remove the head of the queue
		System.out.println("\nUsing remove() to retrive and remove the head: ");
		   Integer removedElement = queue.remove();
		   System.out.println("the removed Element is: "+ removedElement);
		   System.out.println("After the removed of the queue: "+ queue);
		   
    // Using() to remove and poll() retrive the head of the queue(return null if empty)
		System.out.println("\n remove and retirive the element head of the queue: ");
		Integer pollElement = queue.poll();
		System.out.println("the queue is head of: "+ pollElement);
		System.out.println("After the poll of the element : "+ queue);
		
    // Using peek() to retrive the head of the queue without removing it
		System.out.println("\n retrive the element of the queue withpout remove: ");
		Integer peekElement = queue.peek();
		System.out.println("the peek element is: "+ peekElement);
		System.out.println("Queue after peek() "+ queue);
		
       
	}

}
