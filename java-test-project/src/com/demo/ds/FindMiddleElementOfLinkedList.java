package com.demo.ds;

/**
 * Efficient approach: 1. Use two pointer fastptr and slowptr and initialize
 * both to head of linkedlist 2. Move fastptr by two nodes and slowptr by one
 * node in each iteration. 3. When fastptr reaches end of nodes, the slowptr
 * pointer will be pointing to middle element.
 * 
 * @author GautamV
 *
 */
public class FindMiddleElementOfLinkedList {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		LinkedList.Node head = new LinkedList.Node(1);

		linkedList.addToTheLast(head);
		linkedList.addToTheLast(new LinkedList.Node(2));
		linkedList.addToTheLast(new LinkedList.Node(3));
		linkedList.addToTheLast(new LinkedList.Node(4));
		linkedList.addToTheLast(new LinkedList.Node(5));

		linkedList.printList();

		LinkedList.Node middle = linkedList.findMiddleNode(head);
		System.out.println("Middle node will be: " + middle.value);
	}
}
