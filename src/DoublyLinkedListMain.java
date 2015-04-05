
public class DoublyLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dlist=new DoublyLinkedList();
		DoublyLinkedList dlist1=new DoublyLinkedList();
		dlist.deleteLast();
		dlist.displayListFirst();
		dlist.insertFirst(35);
		dlist.insertFirst(45);
		dlist.insertFirst(25);
		dlist.insertFirst(3);
		dlist.insertFirst(2);
		dlist.insertFirst(1);
		System.out.println("First List");
		dlist.displayListFirst();
		dlist.rotate(4);
		System.out.println("List after rotarion");
		dlist.displayListFirst();
		dlist1.insertFirst(8);
		dlist1.insertFirst(7);
		dlist1.insertFirst(6);
		dlist1.insertFirst(5);
		dlist1.insertFirst(4);
		
		
		System.out.println("First List");
		dlist.displayListFirst();
		System.out.println("\nSecond List");
		dlist1.displayListFirst();
		System.out.println("\nFirst List after Merging");
		dlist.mergerList(dlist, dlist1);
		dlist.displayListFirst();
		System.out.println("\nSecond List");
		dlist1.displayListFirst();
		
		if(dlist.searchElement(105)){
			System.out.println("Element is found");
		}
		else{
			System.out.println("Not found");
		}
		System.out.println("\n*****************************************************");
		dlist.displayListFirst();
		System.out.println("\n*****************************************************");
		dlist.reverseAlternateAppendEnd();
		System.out.println("\n*****************************************************");
	//System.out.println("Middle Element is:-"+dlist.getMiddle());
		dlist.sortLinkedList();
		System.out.println("\n*****************************************************");
		System.out.println("\nReversed Link List:- ");
		dlist.reverseLinkedList();
		dlist.displayListFirst();
		System.out.println("\n*****************************************************");
		dlist.swapElementsPairwise();
		System.out.println("Swapped elements pairwise:-");
		dlist.displayListFirst();
		
	}

}
