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
		boolean result = myThirdNode.getNext().equals(mySecondNode) &&
				myThirdNode.getNext().getNext().equals(myFirstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenAddedToTheListShouldBeAppend() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList1 myLinkedList1 = new MyLinkedList1();
		myLinkedList1.append(myFirstNode);
		myLinkedList1.append(mySecondNode);
		myLinkedList1.append(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) &&
						myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
}
