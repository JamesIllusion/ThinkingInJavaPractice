// given a binary search tree, convert the tree to its mirror (swap left and right), recursively and iteratively

// answer: almost same as traversal, adding swap sub-tree function 

package algorithm_interview;

public class AlgorithmQuestion10 {
	
	void mirrorRecursive(BSTNode root){
		if(root==null)
			System.out.println("ERROR: input tree is empty!");
		
		BSTNode temp = root.m_Left;
		root.m_Left = root.m_Right;
		root.m_Right = temp;
		
		if(root.m_Left!=null)
			mirrorRecursive(root.m_Left);
		if(root.m_Right!=null)
			mirrorRecursive(root.m_Right);
	}

}
