
public class DoublyLinkedList {
	Node first,last;
	int count=0;
	private int deleted_element; 
	
public DoublyLinkedList(){
	first=last=null;
}

public boolean isEmpty(){
	return first==null;
}

public void insertFirst(int element){
	
	Node newNode=new Node(element);
	
	if(first!=null){
	first.previous=newNode;
	}
	else if(first==null){
		last=newNode;
	}
	newNode.next=first;
	first=newNode;
	count++;
	System.out.println("Node is inserted at First:- "+ element+ " Now First Element is:-" + first.iData);
}

public void insertLast(int element){
Node newNode=new Node(element);
	
	if(last!=null){
	newNode.previous=last;
	}
	else if(first==null){
		first=newNode;
	}
	last.next=newNode;
	last=newNode;
	count++;
	System.out.println("Node is inserted at Last:- "+ element+ " Now Last Element is:-" + last.iData);
}

public void displayListFirst(){
	
	if(!isEmpty()){
		//System.out.println("Traversing elements from First:- ");
		for (Node current=first;current!=null;current=current.next)
		{
			
			System.out.print(current.iData+"-->");
		}
		//System.out.println("Count:-"+count+"\n");
	}else{
		System.out.println("List is empty");
	}
	
}

public void displayListLast(){
	if(!isEmpty()){
		System.out.println("Traversing elements from Last:- ");
		for (Node current=last;current!=null;current=current.previous)
		{
			System.out.print(current.iData+"-->");
		}
		System.out.println("\n");
	}else{
		System.out.println("List is empty");
	}
}

public void deleteFirst(){
	if(!isEmpty()){
	deleted_element=first.iData;
	first=first.next;
	System.out.println("Deleted element:- "+ deleted_element+ " Now First Element is:-" + first.iData);
	}
	else{
		System.out.println("List is empty");
	}
}

public boolean searchElement(int searchElement){
	
	for (Node current=first;current!=null;current=current.next)
	{
		if(searchElement==current.iData){
			return true;
		}
	}
	return false;
}

public void deleteLast(){
	if(!isEmpty()){
		deleted_element=last.iData;
		last.previous.next=null;
		last=last.previous;
		
		System.out.println("Deleted element:- "+ deleted_element+ " Now Last Element is:-" + last.iData);
	}
	else{
		System.out.println("List is empty");
	}
	}




public void sortLinkedList(){
	int temp;
	int count1=count;
	while(count1!=0){
	for (Node current=first;current.next!=null;current=current.next)
	{
		
		if(current.iData>current.next.iData){
			
			temp=current.iData;
			current.iData=current.next.iData;
			current.next.iData=temp;
		}
	}
	count1--;
	}
	System.out.println("\nSorted Link List Ascending:- ");
	
	for (Node current=first;current!=null;current=current.next)
	{
		System.out.print(current.iData+"-->");
	}
}

public void reverseLinkedList(){
	Node head=first;
	Node second=head.next;
	if(head==null || head.next ==null){
		return;
	}
	Node third=second.next;
	head.next=null;
	second.next=head;
	
	Node previousNode,currentNode;
	
	previousNode=second;
	currentNode=third;
	
	while(currentNode!=null){
		Node newNode=currentNode.next;
		currentNode.next=previousNode;
		previousNode=currentNode;
		currentNode=newNode;
	}
	first=previousNode;
	

	
}
public int getMiddle (){
	int mid_element=count/2;
	int i=1;
	//System.out.println(mid_element);
	Node current=first;
	while(i<=mid_element){
		current=current.next;
		i++;
	}
	return current.iData;
}

public void rotate(int k){
	Node current=first;
	int cnt=1;
	while(cnt<k){
		current=current.next;
		cnt++;
	}
	System.out.println("Last Element "+ last.iData);
	last.next=first;
	first=current.next;
	current.next=null;
}

public void swapElementsPairwise(){
	
	Node previous,current,next;
	if(first.next==null){
		return;
	}
	previous=first;
	current=first.next;
	first=current;
	while(true){
		
		next=current.next;
		current.next=previous;
		if(next==null || next.next==null || current==null ){
			previous.next=next;
					break;
		}
		previous.next=next.next;
		previous=next;
		current=previous.next;
		
		
	}

	
}

public void reverseAlternateAppendEnd(){
	Node current=first;
	int [] tempStack=new int[count/2];
	int i=0;
	while(current.next!=null){
		if(current.next.next!=null){
		tempStack[i]=current.next.iData;
		current.next=current.next.next;
		current=current.next;
		i++;
		}
		else{
			tempStack[i]=current.next.iData;
			current.next=null;
			last=current;
			//current=current.next;
			i++;
		}
	}
	//System.out.println("IIII:-"+i);
	for (int j=i-1;j>=0;j--){
		//System.out.println("****"+tempStack[j]);
		insertLast(tempStack[j]);
	}
	System.out.println("\nRemoved alternate nodes and appended at the end in reverse order:- ");
	displayListFirst();
}

public void mergerList(DoublyLinkedList dlist ,DoublyLinkedList dlist1){
	Node current1=dlist.first;
	Node current2=dlist1.first;
	Node next1=null;
	
    while(current1!=null && current2!=null){
    	count++;
    	next1=current2.next;
    	current2.next=current1.next;
    	current1.next=current2;
    	current1=current1.next.next;
    	current2=next1;
    
    }
    dlist1.first=next1;
    //System.out.println("Last"+next1.iData);
}

}


