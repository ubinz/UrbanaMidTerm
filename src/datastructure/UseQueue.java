package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("NY");
		queue.add("FL");
		queue.add("CT");
		queue.add("NJ");
		queue.add("PA");
		queue.add("IL");
		queue.add("WA");

		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.element());

		//Using Iterator
	     Iterator its = queue.iterator();
	     while ((its.hasNext())){//While loop
			System.out.println(its.next());

		}
		queue.remove();
	     System.out.println("After removing one element");
	     for(String str : queue){
	     	System.out.println(str);
	}

}


}
