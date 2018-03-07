package Queue;

public class Queue {
	
	private static class Node{
		
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node tail;
	private Node head;
	private static int SIZE;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	//TO ADD THE DATA INTO THE QUEUE
	public void add(int data) {
		SIZE++;
		Node node = new Node(data);
		if (tail != null) {
			tail.next = node;
		}
		tail = node;
		
		if (head == null) {
			head = node;
		}
	}
	
	//TO GET THE PEEK VALUE FROM QUEUE
	public int peek() {
		if (head.next == null) {
			System.out.println("Queue is empty!!!");
			return 0;
		}
		return head.data;
	}
	
	//TO GET THE TAIL VALUE
	public int tail_value() {
		if (head.next == null) {
			System.out.println("Queue is empty!!!");
			return 0;
		}
		return tail.data;
	}
	
	//TO REMOVE FROM THE QUEUE
	public int remove() {
		if (head.next == null) {
			System.out.println("Queue is empty!!!");
			return 0;
		}
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}
	
	//GET THE SIZE OF QUEUE
	public int getSize() {
		return SIZE;
	}
	
	//TO PRINT THE QUEUE
	public void PrintQueue() {
		for (int i = 0; i < SIZE; i ++) {
			if (head.next == null) {
				int data = tail.data;
				System.out.println(data);			
				return;
			}
			int data = head.data;
			System.out.println(data);
			head = head.next;
		}
	}
}
