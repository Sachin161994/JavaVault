package dsaone;

public class LinkedList {
  public Node head;
  public void insert(int data) 
  {
	  Node node = new Node();
	  node.data= data;
	  node.next = null;
	  
	  if(head == null) {
		  head = node;
	  }
	  else {
		  Node n = head;
		  while(n.next!=null) 
		  {
			  n = n.next;
		  }
		  n.next = node;
		  
	  }
	  
  }
  
  public void show() 
  {
	  Node node = head;
	  while(node.next!=null) {
		  System.out.println(node.data);
		  node = node.next;
	  }
	  System.out.println(node.data);
  }
  
  public void insertAtStart(int data) {
	  Node s = new Node();
	  s.data = data;
	  s.next = head;
	  head = s;
  }
  
  public void insertAtEnd(int data) {
	  Node e = new Node();
	  e.data = data;
	  Node n = new Node();
	  n = head;
	  while(n.next!=null) {
		  n = n.next;
	  }
	  n.next = e;
  }
  public void inserAt(int index, int data) {
	  if(index == 0) 
	  {
		  insertAtStart(data);
	  }
	  else {
	  Node node = new Node();
	  node.data = data;
	  Node n = head;
	  int count = 0;
	  while(count<index-1) {
		  n = n.next;
		  count++;
	  }
	  node.next = n.next;
	  n.next = node;
	  }
  }
  
  public void remove(int index) {
	  Node n = new Node();
	  n = head;
	  int count = 0;
	  while(count<index-1) {
		  n = n.next;
		  count++;
	  }
	  Node temp = n.next;
	  n.next = temp.next;
  } 
  public Node removeFromEnd() {
	  Node last = new Node();
	  Node secondLast = new Node();
	  try {
		  last = head;
		  while(last.next!=null) {
			  secondLast = last;
			  last = last.next;
		  }
		  secondLast.next = null;
	  }
	  catch(Exception e){
		  System.out.println("Stack Empty");
	  }
	  return last;
  }
}
