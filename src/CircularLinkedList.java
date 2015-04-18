
public class CircularLinkedList {

	Node first,last;
	int count=0;
	
public CircularLinkedList(){
	first=null;
}

public void insertNode(int element){
	Node newNode=new Node(element);
	if(first==null){
		first=newNode;
		last=newNode;
	}
	else{
		newNode.next=first;
		last.next=newNode;
		first=newNode;
	}
	count++;
}

public void displayCircularList(){
	
	Node current;
	current=first;
	System.out.println("Ciruclar Linked List");
	while( !current.visited){
		System.out.print(current.iData);
		current.visited=true;
		current=current.next;
		
	}
}

public void findLoopCircularLinkedList(){
	Node current;
	current=first;
	while(true){
		current.visited=true;
		current=current.next;
		if(current.visited){
			System.out.println("Loop pointing at"+current.iData);
			return;
		}
		else{
			continue;
		}
	}
	
}

boolean hasLoop() {

    if(first == null) // list does not exist..so no loop either.
        return false;

    Node slow, fast; // create two references.

    slow = fast = first; // make both refer to the start of the list.

    while(true) {

        slow = slow.next;          // 1 hop.

        if(fast.next != null)
            fast = fast.next.next; // 2 hops.
        else
            return false;          // next node null => no loop.

        if(slow == null || fast == null) // if either hits null..no loop.
            return false;

        if(slow == fast) // if the two ever meet...we must have a loop.
            return true;
    }
}

}
