package com.blz.stack.queue;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void given3Numbers_WhenAddedToQueue_ShouldHaveLastAdded() {
		MyQueue<Integer> myQueue = new MyQueue<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		INode<Integer> myNode = myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(myFirstNode, myNode);
	}
}
