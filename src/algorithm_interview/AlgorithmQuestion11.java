// go through a binary tree from top to bottom, level by level

// answer: like 'BFS'

package algorithm_interview;

import java.util.PriorityQueue;
import java.util.Queue;


public class AlgorithmQuestion11 {
	
	void readFromTopToBottom(BSTNode root){
		Queue<BSTNode> nodeQueue = new PriorityQueue<BSTNode>();
		
		if(nodeQueue.isEmpty()){
			nodeQueue.add(root);
		}
		
		while(!nodeQueue.isEmpty()){
			
		}
	}

}
