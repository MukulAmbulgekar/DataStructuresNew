
public class StackLinkedList {
	
	Node first,last;
	
	public StackLinkedList(){
		first=null;
		last=null;
	}
	public boolean isEmpty(){
		if(first==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void Push(int element){
		Node new_node=new Node(element);
		new_node.next=first;
		first=new_node;
		System.out.println("Element pushed: "+element+" First is:"+ new_node.iData);
	}
	
	
	
	public void Pop(){
		System.out.println("Element popped is: "+first.iData);
		first=first.next;
		System.out.println("New First is:"+ first.iData);
		
	}
	public void displayList(){
		Node current;
		current=first;
		System.out.println("List Elements are:-");
		while (current!=null){
			System.out.print(current.iData+"\t");
			current=current.next;
		}
		System.out.println("\n");
	}
	
	

}
