// given an integer and a binary tree,  find all whose sum equals to the integer

// answer: recursive calculation using stack. (personal guess: pre-order traversal)

package algorithm_interview;

public class AlgorithmQuestion4 {
	boolean isLeaf(BSTNode node){
		if (node.m_Left==null && node.m_Right==null)
			return true;
		else
			return false;
	}
	
	void findPath(BSTNode root, int goal){
		if(root==null)
			System.out.println("ERROR: Empty tree!!");
		
		int cur_sum = 0;
		
		if(cur_sum==goal && isLeaf(root)){
			// find a path
		}
		
		if(root.m_Left!=null)
			findPath(root.m_Left, goal);
		if(root.m_Right!=null)
			findPath(root.m_Right, goal);
		
		cur_sum-=root.m_nValue;
		
	}

}
