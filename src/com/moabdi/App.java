package com.moabdi;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		System.out.println("Append to singly linked list");
 		list.append(11);
 		list.append(12);
 		list.append(13);
 		list.append(14);
 		list.append(15);
 		list.append(16);
 		list.append(17);
		
		System.out.println("Remove Tail ");
		list.removeTail();
		list.list();
				
		System.out.println("Remove element ");
		list.remove(14);
		list.list();
		
		System.out.println("Remove after element ");
		list.removeAllAfter(16);
		list.list();

	}
}
