package algorithm_interview;

class AVLNode{
	int key;
	int height;
	AVLNode lChild;
	AVLNode rChild;
	
	private AVLNode(){}
	
	public AVLNode(int key, AVLNode left, AVLNode right){
		this.key = key;
		this.lChild = left;
		this.rChild = right;
	}
}

public class AVLBalanceTree {
	// if two nodes height difference is larger than 2, then it requires rotate to maintain balance
	
	
	//Left node unbalanced with left child
	public static AVLNode rotateLL(AVLNode node){
		AVLNode top = node.lChild;
		node.lChild = top.rChild;
		top.rChild = node;
		
		node.height = Math.max(node.lChild.height, node.rChild.height)+1;
		top.height = Math.max(top.lChild.height, top.rChild.height)+1;
		
		return top;
	}
	
	//Right node unbalanced with right child
	public static AVLNode rotateRR(AVLNode node){
		AVLNode top = node.rChild;
		node.rChild = top.lChild;
		top.lChild = node;
		
		node.height = Math.max(node.lChild.height, node.rChild.height)+1;
		top.height = Math.max(top.lChild.height, top.rChild.height)+1;
		
		return top;
	}
	
	//Left node unbalanced with right child
	public static AVLNode rotateLR(AVLNode node){
		node.lChild = rotateLL(node.lChild);
		return rotateRR(node);
	}
	
	public static AVLNode rotateRL(AVLNode node){
		node.rChild = rotateRR(node.rChild);
		return rotateLL(node);
	}
	
}
