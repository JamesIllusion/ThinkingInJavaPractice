package algorithm_interview;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	//this class should not be instantiated
	private QuickSort(){	}
	
	static int partition(int[] array, int left, int right, int pivotIndex){
		int pivotValue = array[pivotIndex];
		
//		pivotValue = array[pivotIndex];
		array[pivotIndex] = array[right];
		array[right] = pivotValue;
		
		int storeIndex = left;
		
		for(int i=left; i<right; i++)
			if(array[i]<pivotValue){
				int temp = array[i];
				array[i] = array[storeIndex];
				array[storeIndex] = temp;
				
				storeIndex++;
			}
		
		array[right] = array[storeIndex];
		array[storeIndex] = pivotValue;
		
		return storeIndex;
	}
	

	static int[] sort(int[] array, int left, int right){
		if(right>left){
			Random rand = new Random();
			int pivotIndex = rand.nextInt(right-left+1);
//			System.out.println("pivot index = " + pivotIndex);
			int index = partition(array, left, right, pivotIndex);
			sort(array, left, index-1);
			sort(array, index+1, right);
		}
		
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {3,5,8,4,6,1,2,7,9,0};
		
		int[] array_sorted = sort(array, 0, 9);
		
//		for (int i=0; i<array_sorted.length; i++)
//			System.out.print(array_sorted[i] + ", ");
		
		System.out.println(Arrays.toString(array_sorted));
	}
}
