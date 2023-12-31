package InputOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayListAndLinkedList {
	public static void main(String []args) {
		List <Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(0,10);
		arrayList.add(3,30);
		
		System.out.println("The List of numbers in the ArrayList ");
		System.out.println(arrayList);
		
		LinkedList <Object> linkedList=new LinkedList<>(arrayList);
		linkedList.add(1,"red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		System.out.println("List of items in the linked list forwardly ");
		
		ListIterator <Object> listIterator=linkedList.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
			
		}
		System.out.println(" ");
		System.out.println("List of item backwardly ");
		listIterator=linkedList.listIterator(linkedList.size());
		while(listIterator.hasPrevious())
			System.out.print(listIterator.previous() + " ");
	}
}
