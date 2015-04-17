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

	public boolean isFull() {

		if (rear == queue_size - 1) { // if both rear=size-1 then queue is full
										// or front=-1 and rear=-1 then queue is
										// empty
			return false;
		} else {
			return true;
		}

	}

	public void enQueue(int element) {
		if (isFull()) {
			if (front == -1 && rear == -1) { // if queue is empty i.e. first
												// element to be enqueued the
												// front++,rear++,
												// a[rear]=element
				front++;
				rear++;
				queueArray[rear] = element;

				System.out.println("Queue is not full and " + element
						+ " is enqueued:- front: " + front + " Rear: " + rear);
			} else if (front != -1) { // if queue is not empty then increment
										// rear++ only and a[rear]=element
				rear++;
				queueArray[rear] = element;

				System.out.println("Queue is not full and " + element
						+ " is enqueued:- front: " + front + " Rear: " + rear);
			}

		} else { // rear==size-1 it means queue is full

			System.out.println("Queue is full");
		}

	}

	public void deQueue() {

		if (front == -1 && rear == -1) { // if both rear and front=-1 then queue
											// is empty
			System.out.println("Queue is empty");

		} else {

			if (front == queue_size - 1) { // if it's last element in queue that
											// is dequeued then dequeue it and
											// set front and rear to -1
				System.out.println("Element Dequeued is : " + queueArray[front]
						+ " front: " + front + " Rear: " + rear);
				front = -1;
				rear = -1;

			} else { // if it's not a last element in queue then dequeue element
						// at front and set current front=front+1 i.e. FIFO
				System.out.println("Element Dequeued is : " + queueArray[front]
						+ " front: " + front + " Rear: " + rear);
				front++;
			}
		}
	}

}
