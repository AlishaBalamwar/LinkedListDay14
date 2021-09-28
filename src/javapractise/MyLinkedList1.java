package javapractise;

public class MyLinkedList1<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList1(){
		this.head = head;
		this.tail = tail;
	}
	
	public void add(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
			}
		}
	
	public void append(INode<K> newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
			
		if(this.head == null) {
			this.head = newNode;
		}else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
}
