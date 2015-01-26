// given a sequence of array, tell if it is an output of post-order traversal of a binary search tree (can be applied to pre-order)

// answer: root of the tree should be the last element of the array, and left sub-tree is smaller, right sub-tree bigger 

package algorithm_interview;

public class AlgorithmQuestion6 {
	
	// this class should not be instantiated
	private AlgorithmQuestion6(){}
	
	static boolean verifyPostOrder(int[] array){
		if(array.length<=0)
			return false;
		
		int root = array[array.length-1];
		
		// to determine left sub-tree
		int i=0;
		for(; i<array.length-1; i++)
			if(array[i]>root)
				break;
		
		int[] left = new int[i+1];
		
		// to verify right sub-tree
		int j=i;
		for(; j<array.length-1; j++)
			if(array[j]<root)
				return false;
		
		int[] right = new int[array.length-1-left.length];
		
		System.arraycopy(array, 0, left, 0, left.length);
		System.arraycopy(array, i+1, right, 0, right.length);
		
		return (verifyPostOrder(left) && verifyPostOrder(right));
	}
	
	static boolean verifyPreOrder(int[] array){
		if(array.length<=0)
			return false;
		
		int root = array[0];
		
		int i=1;
		for(; i<array.length; i++)
			if(array[i]>root)
				break;
		
		int j=i;
		for(; j<array.length; j++)
			if(array[j]<root)
				return false;
		
		int[] left = new int[i+1];
		int[] right = new int[array.length-1-left.length];
		
		System.arraycopy(array, 1, left, 0, left.length);
		System.arraycopy(array, i+1, right, 0, right.length);
		
		return (verifyPreOrder(left) && verifyPreOrder(right));
	}

	public static void main(String[] args){
		int[] test_array = {5,7,9,11,10,8};
		
		System.out.println("Test result is " + verifyPostOrder(test_array));
	}
}
