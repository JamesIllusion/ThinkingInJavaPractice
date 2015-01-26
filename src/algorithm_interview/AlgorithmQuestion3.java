// given an array of integers, including positive and negative, find a MAX sum from a sub-array

// answer: greedy algorithm, add element up, once smaller than 0, start from 0

package algorithm_interview;

class findMaxSum{
	findMaxSum(int a[]){
		int sum=0;
		int max=-(1<<31);
		
		if(a.length<=0)
			System.out.println("ERROR: input array not exist.");
		
		for(int i=0; i<a.length; i++){
			sum+=a[i];
			
			if(sum>max)
				max = sum;
			else if(sum<0)
				sum=0;
		}
		
		System.out.println("max of sub array is " + max) ;
	}
}

public class AlgorithmQuestion3 {
	public static void main(String[] args){
		int[] test_array_1 = {1, -2, 3, 10, -4, 7, 2, -5};
		int[] test_array_2 = {-1, -2, -3, -4, -5, -6};
		
		findMaxSum result_1 = new findMaxSum(test_array_1);
		findMaxSum result_2 = new findMaxSum(test_array_2);
	}

}
