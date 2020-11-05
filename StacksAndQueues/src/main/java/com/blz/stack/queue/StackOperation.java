package com.blz.stack.queue;

public class StackOperation<K> {
	private final MyLinkedList myList;
	
	public StackOperation() {
		this.myList = new MyLinkedList<>();
	}
	
	public void push(INode<K> myNode) {
		myList.add(myNode);
	}
	
	public INode<K> peak() {
		return myList.head;
	}
	
	public void printStack() {
		myList.printMyNode();
	}
	
	public INode<K> pop() {
		return myList.head;
	}
}
