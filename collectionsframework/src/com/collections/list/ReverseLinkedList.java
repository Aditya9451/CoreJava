package com.collections.list;

public class ReverseLinkedList {
	
	
	static Node head;
	
	static class Node{
		
		Node next;
		int data;
		public Node(int data) {
			super();
			this.data = data;
		}
		
		
	}

	static Node MiddleElement(Node n) {
		
		Node fastPointer=n;
		Node slowPointer=n;
		Node temp;
		
		Node new_Node= new Node(5);
		if(n!=null) {
		while(fastPointer!=null && slowPointer!=null) {
			fastPointer=fastPointer.next.next;
			slowPointer= slowPointer.next;
		}
		
		temp= slowPointer.next;
		
		}
		return n;
	}
	static Node reverselinkedList(Node n) {
		
		
		Node current= n;
		Node previous= null;
		Node next= null;
		
		while(current!=null) {
			
			next=  current.next;
			current.next=previous;
			previous=current;
			current= next;
			
		}
		n = previous; 
		return n;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ReverseLinkedList rl = new ReverseLinkedList();
		head= new Node(1);
		head.next= new Node(3);
		//head.next.next= new Node(4);
		head.next.next= new Node(6);
		
		//head= reverselinkedList(head);
	head=MiddleElement(head);
		while(head!=null) {
			
			System.out.println(head.data+" ");
			head= head.next;
		}
	}

}
