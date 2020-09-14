package inheritance;

public class Amdocs {
	// Java program to rotate a linked list 

	class LinkedList 
	{ 
		Node head; // head of list 

		
		void rotate(int k) 
		{ 
			if (k == 0) return; 

			Node current = head; 

			int count = 1; 
			while (count < k && current != null) 
			{ 
				current = current.next; 
				count++; 
			} 

			
			if (current == null) 
				return; 

			
			Node kthNode = current; 

			// current will point to last node after this loop 
			// current will point to node 60 in the above example 
			while (current.next != null) 
				current = current.next; 

			// Change next of last node to previous head 
			// Next of 60 is now changed to node 10 

			current.next = head; 

			// Change head to (k+1)th node 
			// head is now changed to node 50 
			head = kthNode.next; 

			// change next of kth node to null 
			kthNode.next = null; 

		} 

	
	}
	class Node 
	{ 
		private int data; 
		private Node next;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		} 
		
		
		
	} 

}
