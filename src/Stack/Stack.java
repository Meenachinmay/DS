package Stack;

public class Stack {
	private class Node {
		private Node next;
		private int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty() {
		return top == null || top.next == null;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int peek() {
		if (top.next == null || top == null) {
			return 0;
		}
		return top.data;
	}
	
	public int pop() {
		if (top == null) {
			return 0;
		}
		int data = top.data;
		top = top.next;
		return data;
	}
}
