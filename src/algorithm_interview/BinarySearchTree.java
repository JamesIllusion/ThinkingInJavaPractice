package algorithm_interview;

class BinaryNode{
	int key;
	BinaryNode lChild;
	BinaryNode rChild;
	
	private BinaryNode(){}
	
	public BinaryNode(int key, BinaryNode left, BinaryNode right){
		this.key = key;
		this.lChild = left;
		this.rChild = right;
	}
}

public class BinarySearchTree {
	
	// binary search tree operations
	public static BinaryNode add(int key, BinaryNode tree_root){
		if(tree_root == null)
			tree_root = new BinaryNode(key, null, null);
		
		if(key<tree_root.key)
			tree_root.lChild = add(key, tree_root.lChild);
		
		else if(key>tree_root.key)
			tree_root.rChild = add(key, tree_root.rChild);
		
		return tree_root;
	}
	
	public static boolean search(int value, BinaryNode tree_root){
		if(tree_root == null)
			return false;
		
		if(tree_root.key == value)
			return true;
		
		else if(tree_root.key > value)
			return search(value, tree_root.lChild);
		
		else if(tree_root.key < value)
			return search(value, tree_root.rChild);
		
		else
			return false;
	}
	
	public static BinaryNode delete(int value, BinaryNode tree_root){
		if(tree_root == null)
			return null;
		
		if(value < tree_root.key)
			delete(value, tree_root.lChild);
		
		else if(value > tree_root.key)
			delete(value, tree_root.rChild);
		
		else if(value == tree_root.key){
			if(tree_root.lChild==null && tree_root.rChild==null)
				tree_root = null;
			
			else if(tree_root.lChild!=null && tree_root.rChild==null){
				tree_root.key = tree_root.lChild.key;
				tree_root.lChild = tree_root.lChild.lChild;
				tree_root.rChild = tree_root.lChild.rChild;
			}
			
			else if(tree_root.lChild==null && tree_root.rChild!=null){
				tree_root.key = tree_root.rChild.key;
				tree_root.lChild = tree_root.rChild.lChild;
				tree_root.rChild = tree_root.rChild.rChild;
			}
			
			// both left and right child exists, swap the root with successor
			else{}
		}
		
		return tree_root;
	}
	
}
