package algorithm_interview;

import java.util.Arrays;

public class InsertionSort {
	
	// this class should not be instantiated
	private InsertionSort(){}
	
	static int[] sort(int[] array){
		int temp = 0;
		
		for (int i=1; i<array.length; i++){
//			System.out.println("a.i_1 = " + array[i]);
			int j = i;
			temp = array[i];
			
			while(j>0 && array[j-1] > temp){
				array[j] = array[j-1];
				j--;
			}array[j] = temp;
		}
		
		return array;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,5,8,4,6,1,2,7,9,0};
			
		int array_sorted[] = sort(array);
		
//		for (int i=0; i<array.length; i++)
//			System.out.print(array_sorted[i] + ", ");
		
		System.out.println(Arrays.toString(array_sorted));
	}

}
