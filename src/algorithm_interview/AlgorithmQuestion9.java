// given a sorted array and an integer, find a pair of elements from the array added up equal to the given integer

// answer: two cursors from head and end, if sum is bigger then move rear cursor, if smaller move front cursor

package algorithm_interview;

public class AlgorithmQuestion9 {
	
	// this class should not be instantiated
	private AlgorithmQuestion9(){}
	
	static void findPairSum(int[] array, int K){
		int front = 0;
		int rear = array.length-1;
		
		while(array[front]+array[rear]!=K && front<rear){
			if(array[front]+array[rear]<K)
				front++;
			else if(array[front]+array[rear]>K)
				rear--;
			else if(array[front]+array[rear]==K)
				break;
		}
		
		System.out.println("the pair of elements are " + array[front] + " and " + array[rear]);
	}
	
	public static void main(String[] args){
		int[] test_array = {1,2,4,7,11,15};
		int test_K = 15;
		
		findPairSum(test_array, test_K);
	}

}
