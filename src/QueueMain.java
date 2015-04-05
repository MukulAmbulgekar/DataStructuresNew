
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueArray queue=new QueueArray(5);
		
		
	queue.enQueue(2);
	queue.enQueue(3);

	queue.deQueue();
	queue.enQueue(3);
	queue.enQueue(4);
	queue.enQueue(5);
	
	System.out.println("\n*************************");

	QueueLinkedList queueList=new QueueLinkedList();

	queueList.displayList();
	queueList.deleteNode();
	queueList.inserNode(25);
	queueList.inserNode(15);
	queueList.inserNode(35);
	queueList.inserNode(45);
	queueList.inserNode(55);
	queueList.inserNode(65);
	queueList.inserNode(75);
	queueList.inserNode(85);

	queueList.displayList();
	queueList.deleteNode();
	queueList.deleteNode();
	queueList.deleteNode();
	queueList.displayList();
	queueList.inserNode(25);
	queueList.inserNode(15);
	queueList.inserNode(35);
	queueList.deleteNode();
	queueList.displayList();

	
	}

}
