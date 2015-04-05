
public class BinaryTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree bt=new BinaryTree();
	bt.insertNode(20);
	bt.insertNode(9);
bt.insertNode(49);
bt.insertNode(23);
bt.insertNode(52);
bt.insertNode(50);
bt.insertNode(5);
bt.insertNode(12);
bt.insertNode(15);
if(bt.searchElement(55)!=null){
	System.out.println("Found");
}
else{
	System.out.println("Not  found");
}
bt.Traversal();

bt.minMaxElement();
System.out.println("Sum of left leaf nodes:-"+bt.sumLeftLeaves(bt.root));
System.out.println("Sum of right leaf nodes:-"+bt.sumRightLeaves(bt.root));
	}

}
