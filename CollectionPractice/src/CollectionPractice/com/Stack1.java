package CollectionPractice.com;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// Create a stack of Integer type
		Stack<Integer> stack =  new Stack<>();
		
		// Push the element of the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		// Display the current stack
		System.out.println("Stack after pushing the elements: "+ stack);
		
	   // Pop of the element of the stack
		System.out.println("Popped of the elemnt: "+ stack.pop());
		
		// Peek at the element without removing the it
		System.out.println("Ater pop of the element: "+ stack);
		
		// Peek at the top of the elelemnt without remiving it
		System.out.println("Top element: "+ stack.peek());
		
		// check if the stack is empty
		System.out.println("Is the stack empty:"+ stack.empty());
		
		// Search for an elemnt in the stack
		int position = stack.search(30);
		if(position != -1) {
			System.out.println("Element of 30 found at position: "+ position);
			
		} else 
		{
			System.out.println("Element 30 not found in the stack");
		}
		
		
		

	}

}
