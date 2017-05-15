package com.moabdi;

/**
 * Class SinglyLinkedList
 * 
 * @author Mostapha
 * 
 */
public class SinglyLinkedList {
	Node head;

	/**
	 * Parse linkedlist
	 */
	public void list() {
		Node tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}

	/**
	 * Append an element into the linkedlist
	 * 
	 * @param element
	 *            : int
	 */
	public void append(int element) {
		Node node = new Node(element);
		if (head == null) {
			head = node;
		} else {
			Node last = head;

			while (last.next != null)
				last = last.next;
			last.next = node;
		}
	}

	/**
	 * Remove the tail element from a linkedlist
	 * 
	 * @param element
	 *            : int
	 */
	public void removeTail() {
		Node tmp = head;
		Node prev = head;
		Node refNode = null;
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.next == null) {
				// found the last element
				refNode = tmp;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		if (refNode != null) {
			if (prev == head)
				head = null;
			else
				prev.next = null;
		} else {
			System.out.println("List empty!");
		}
	}

	/**
	 * Remove an element from a linkedlist
	 * 
	 * @param element
	 *            : int
	 */
	public void remove(int element) {
		Node tmp = head;
		Node refNode = null, prev = null;
		System.out.println("head: " + head.data);
		// Traverse till given element
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.data == element) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		if (refNode != null) {
			tmp = refNode.next;
			prev.next = refNode.next;
		} else {
			System.out.println("Unable to find the given element '" + element + "'!");
		}
	}

	/**
	 * Remove all element in the linkedlist that is great than a target value
	 * 
	 * @param target
	 *            : int
	 */
	public void removeAllAfter(int target) {
		Node tmp = head;
		Node refNode = null, prev = null;
		System.out.println("head: " + head.data);
		// Traverse till given element
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.data > target) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			prev = tmp;
			tmp = tmp.next;
		}
		if (refNode != null) {
			tmp = refNode.next;
			prev.next = null;
		} else {
			System.out.println("Unable to find element(s) after '" + target + "'");
		}
	}

	/**
	 * Class Node
	 * 
	 * @author Mostapha
	 *
	 */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

}