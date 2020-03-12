package dsaone;

public class QueueUsingLL {
	private Node first, last;
	
	private class Node{
		String data;
		Node next;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void enqueue(String item) {
		Node oldlast = last;
		last = new Node();
		last.data = item;
		last.next = null;
		if(isEmpty()) first = last;
		else {oldlast.next = last;}
	}
	public String dequeue() {
		String item = first.data;
		first = first.next;
		if(isEmpty()) last = null;
		return item;
	}
}
