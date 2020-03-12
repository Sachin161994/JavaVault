package dsaone;

import java.util.Iterator;

public class StackUsingArray<Item> implements Iterable<Item> {
	private String[] s;
	private int N = 0;
	public void FixedCapacityStackOfStrings(int capacity) {
		s = new String[capacity];
	}
	public boolean isEmpty() {
		return N == 0;
	}
	public void push(String item) {
		s[N++] = item;
	}
	
	public String pop() {
		String item = s[--N];
		s[N] = null;
		return item;
	}
	public Iterator<Item> iterator(){
		return new ReverseArrayIterator();
	}
	public class ReverseArrayIterator  implements Iterator<Item>{
		private int i = N;
		public boolean hasNext() { return i > 0;}
		public Item next() { return s[--i];}
	}

}
