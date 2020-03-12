import dsaone.Node;
import dsaone.LinkedList;
public class LinkedListRunner {
	public static void main(String[] args) {
	LinkedList list = new LinkedList();
	list.insert(6);
	list.insert(7);
	list.insert(8);
	list.insertAtStart(5);
	list.inserAt(2, 10);
	list.insertAtEnd(9);
	list.remove(2);
	list.removeFromEnd();
	list.show();
	}
}