package javapractise;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToTheListShouldBeAddedToTheTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList1 myLinkedList1 = new MyLinkedList1();
		myLinkedList1.add(myFirstNode);
		myLinkedList1.add(mySecondNode);
		myLinkedList1.add(myThirdNode);
	}
}
