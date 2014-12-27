package algorithm_interview;

import java.util.Arrays;

public class BubbleSort {
	
	// this class should not be instantiated
	private BubbleSort(){}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,5,8,4,6,1,2,7,9,0};
		int temp = 0;
		
		for (int i=0; i< array.length-1; i++)
			for (int j=0; j<array.length-i-1; j++)
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
		
//		for (int i=0; i<array.length; i++)
//			System.out.print(array[i] + ", ");
		
		System.out.println(Arrays.toString(array));
	}

}
