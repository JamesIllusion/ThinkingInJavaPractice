// given a binary search tree, convert it to a sorted double link list without extra space (in-place operation)

package algorithm_interview;

class BSTNode{
	int m_nValue;		//value of node
	BSTNode m_Left;		//left child of node
	BSTNode m_Right;	//right child of node
	
	private BSTNode(){}
	
}


public class AlgorithmQuestion1 {
	
	//in-order traversal to convert to link list
	public static void inorderConvert(BSTNode root, BSTNode list){
		if(root==null)
			System.out.println("ERROR: NULL NODE");
		
		if(root.m_Left!=null)
			inorderConvert(root.m_Left, list);
		
		list = root.m_Left;
		list.m_Right = root;
		
		if(root.m_Right!=null)
			inorderConvert(root.m_Right, list);
	}

}
