package InputOutput;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[]args) {
	QueueDemo demo=new QueueDemo();
	Queue queue=demo.createQueue();
	demo.printQueue(queue);
	}
	
	private Queue createQueue() {
		PriorityQueue<Integer> integersOfNumbers=new PriorityQueue<>();
		integersOfNumbers.add(100);
		integersOfNumbers.add(300);
		integersOfNumbers.add(569);
		
	return integersOfNumbers;
	}
	
	private void printQueue(Queue queue) {
		System.out.println("Retreive head of List "+queue.peek());
		System.out.println("Retrieve and remove head of list -1st -->"+queue.poll());
		System.out.println("Retrieve and remove head of list -2nd -->"+queue.poll());
	}
	
	
	
	
	
	}

