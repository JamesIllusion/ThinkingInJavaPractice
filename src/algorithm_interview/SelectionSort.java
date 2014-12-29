package algorithm_interview;

import java.util.Arrays;

public class SelectionSort {
	
	// this class should not be instantiated
	private SelectionSort(){}
	
	static int[] sort(int[] array){
		int tmp_min = 0;
		int temp = 0;
		
//		for (int i=0;  i<array.length; i++){
		for (int i=0;  i<array.length-1; i++){		//this is more precise
			tmp_min = i;
//			System.out.println("tmp_min_1 = " + tmp_min);
			
			for (int j=i+1; j<array.length; j++){
				if (array[j] < array[tmp_min])
					tmp_min = j;
//				System.out.println("tmp_min2 = " + tmp_min);
			}
			
			temp = array[i];
			array[i] = array[tmp_min];
			array[tmp_min] = temp;
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,5,8,4,6,1,2,7,9,0};
		
		int[] array_sorted = sort(array);
		
//		for (int i=0; i<array_sorted.length; i++)
//		System.out.print(array_sorted[i] + ", ");
		
		System.out.println(Arrays.toString(array_sorted));

		}
		

}