package com.blz.stack.queue;

public class MyQueue<K extends Comparable<K>> {
	private final MyLinkedList<K> myList;
	public MyQueue() {
		myList = new MyLinkedList<K>();
		}
		public void enqueu(INode<K> myNode) {
			myList.append(myNode);
		}
		public INode<K> dequeue() {
			return myList.pop();
		}
		public INode<K> peak() {
			return myList.head;
		}
		public void printQueue() {
			myList.printMyNode();
		}
}
