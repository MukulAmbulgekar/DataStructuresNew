
public class QueueLinkedList {
	
	Node first,last;
	
	public QueueLinkedList(){
		first=last=null;
	}
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void inserNode(int element){
		Node new_node=new Node(element);
	
		new_node.next=first;
		if(first!=null){
			first.previous=new_node;
		}
		
		first=new_node;
		if(last==null){
			last=new_node;
		}
		System.out.println("Element enQueued: "+element+" First is:"+ new_node.iData);
	}
	
	public void deleteNode(){
		if(!isEmpty()){
		System.out.println("Element deQueued is: "+last.iData);
		last.previous.next=null;
		last=last.previous;
		
		System.out.println("New Last is:"+ last.iData);
		}else{
			
			
		System.out.println("List is empty");
				
		}
		
	}
	public void displayList(){
		if(!isEmpty()){
		
		System.out.println("List Elements are forward order:-");
		for (Node current=first;current!=null;current=current.next){
			System.out.print(current.iData+"\t");
			
		}
		System.out.println("\n");
		System.out.println("List Elements are backward order:-");
		for (Node current=last;current!=null;current=current.previous){
			System.out.print(current.iData+"\t");
			
		}
		System.out.println("\n");
		}
		else{
			System.out.println("List is empty");
		}
	}
	
	

}
