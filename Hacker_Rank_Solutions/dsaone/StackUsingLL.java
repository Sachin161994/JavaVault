package dsaone;

import java.util.Iterator;

public class StackUsingLL<Item> implements Iterable<Item>{
	private Node first = null;
	private class Node
	{
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
		
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	public class ListIterator implements Iterator<Item>{
		private Node current = first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}

}
