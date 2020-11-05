package com.blz.stack.queue;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void given3Numbers_whenAddedToStack_ShouldHaveLastAddedNode() {
		StackOperation<Integer> myStack = new StackOperation<>();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> peak = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, peak);
	}
	
	@Test
	public void given3Numbers_whenPopedFromStack_ShouldMatchLastAddedNode() {
		StackOperation<Integer> myStack = new StackOperation<>();
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> poped1 = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(myThirdNode, poped1);
		INode<Integer> myNode = myStack.peak();
		myStack.printStack();
		Assert.assertEquals(mySecondNode, myNode);
		INode<Integer> poped2 = myStack.pop();
		myStack.printStack();
		Assert.assertEquals(mySecondNode, poped2);
		INode<Integer> poped3 = myStack.pop();
		Assert.assertEquals(myFirstNode, poped3);
	}
}
