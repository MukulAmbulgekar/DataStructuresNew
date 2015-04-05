public class QueueArray {
	int queue_size;
	int queueArray[];
	int front, rear;

	public QueueArray(int size) {
		queueArray = new int[size];
		queue_size = size;
		front = -1;
		rear = -1;
	}

	public boolean isEmpty() {

		if (rear == queue_size - 1) {
			return false;
		} else {
			return true;
		}

	}

	public void enQueue(int element) {
		if (isEmpty()) {
			if (front == -1 && rear == -1) {
				front++;
				rear++;
				queueArray[rear] = element;

				System.out.println("Queue is not full and " + element
						+ " is enqueued:- front: " + front + " Rear: " + rear);
			} else if (front != -1) {
				rear++;
				queueArray[rear] = element;

				System.out.println("Queue is not full and " + element
						+ " is enqueued:- front: " + front + " Rear: " + rear);
			}

		} else {

			System.out.println("Queue is full");
		}

	}
	
	public void deQueue(){
		
if (front == -1 && rear == -1){
	System.out.println("Queue is empty");
	
}else{
	
	if(front==queue_size-1){
		System.out.println("Element Dequeued is : "+queueArray[front]+" front: " + front + " Rear: " + rear);
		front=-1;
		rear=-1;
		
	}
	else{
	System.out.println("Element Dequeued is : "+queueArray[front]+" front: " + front + " Rear: " + rear);
	front++;
	}
}
	}

}
