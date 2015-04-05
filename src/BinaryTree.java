public class BinaryTree {

	TreeNode root;

	BinaryTree() {
		root = null;
	}

	public void insertNode(int element) {

		TreeNode newNode = new TreeNode(element);

		if (root == null) {
			root = newNode;
		} else {
			TreeNode current, parent;
			current = root;

			while (true) {
				parent = current;
				if (element <= current.iData) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}

			}
		}
	}

	public void Traversal() {
		System.out
				.println("Traversing list in ascending order(Pre Order Traversal)");
		AscendingOrder(root);
		System.out
				.println("\nTraversing list in Descending order(Post Order Traversal)");
		DescendingOrder(root);
		System.out.println("\nPre Order Traversal)");
		PreOrder(root);
	}

	public void DescendingOrder(TreeNode current) {
		TreeNode current1 = current;
		if (current1 != null) {
			DescendingOrder(current1.right);

			System.out.print(current1.iData + "\t");
			DescendingOrder(current1.left);

		}

	}

	public void AscendingOrder(TreeNode current) {
		TreeNode current1 = current;
		if (current1 != null) {
			AscendingOrder(current1.left);

			System.out.print(current1.iData + "\t");
			AscendingOrder(current1.right);

		}

	}

	public void PreOrder(TreeNode current) {
		TreeNode current1 = current;
		if (current1 != null) {
			System.out.print(current1.iData + "\t");
			PreOrder(current1.left);
			PreOrder(current1.right);

		}

	}

	public boolean isLeaf(TreeNode node){
		if(node==null){
			return false;
		}
		if(node.left==null && node.right==null){
			return true;
		}
		return false;
	}
	
	
	
	public int sumLeftLeaves(TreeNode current){
		
		int result=0;
		if(current!=null){
			if(isLeaf(current.left)){
				System.out.println("PArent for current leaf is:-"+ current.iData);
				result+=current.left.iData;
			}
			else{
				result+=sumLeftLeaves(current.left);
			}
			result+=sumLeftLeaves(current.right);
		}
		return result;
	}
	
public int sumRightLeaves(TreeNode current){
		
		int result=0;
		if(current!=null){
			if(isLeaf(current.right)){
				System.out.println("PArent for current leaf is:-"+ current.iData);
				result+=current.right.iData;
			}
			else{
				result+=sumRightLeaves(current.right);
			}
			result+=sumRightLeaves(current.left);
		}
		return result;
	}
	public void delete(int delete_element) {
		TreeNode current = root;
		TreeNode parent = null;
		boolean isLeftElement = false;
		while (current.iData != delete_element) {
			parent = current;
			if (current.iData > delete_element) {
				current = current.left;
				isLeftElement = true;
			} else if (current.iData < delete_element) {
				current = current.right;
				isLeftElement = false;
			}
			if (current == null) {
				System.out.println("Not found");
				return;
			}
		}

			// Scenarios 1:- both the children of delete element are null
			if (current.left == null && current.right == null) {
				// if delete element is root directly make root=null
				if (current == root) {
					root = null;
				}
				// if delete element is not root then if delete element is left
				// child then make left child of parent element is null
				else if (isLeftElement) {
					parent.left = null;
				}
				// if delete element is right child then make left child of
				// parent element is null
				else {
					parent.right = null;
				}
			}
			// Scenario 2:- if left child of delete element is null
			else if(current.left==null){
				if(isLeftElement){
					parent.left=current.right;
				}
				else{
					parent.right=current.right;
				}
			}
			// Scenario 3:- if right child of delete element is null
						else if(current.right==null){
							if(isLeftElement){
								parent.left=current.left;
							}
							else{
								parent.right=current.left;
							}
						}
			
		
	}

	public void minMaxElement(){
		TreeNode currentMin=root;
		TreeNode parentMin=null;
		TreeNode currentMax=root;
		TreeNode parentMax=null;
		while(currentMin!=null){
			parentMin=currentMin;
			currentMin=currentMin.left;
		}
		System.out.println("Minimum Element in tree is:-"+ parentMin.iData);
		while(currentMax!=null){
			parentMax=currentMax;
			currentMax=currentMax.right;
		}
		System.out.println("Maximum Element in tree is:-"+ parentMax.iData);
	}
	
	public TreeNode searchElement(int element) {
		TreeNode current = root;
		while (current.iData != element) {
			if (element < current.iData) {
				current = current.left;
			} else if (element > current.iData) {
				current = current.right;
			}
			if (current == null) {

				return null;
			}
		}
		return current;
	}
}

