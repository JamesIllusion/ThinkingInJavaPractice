package algorithm_interview;

import java.util.Arrays;

public class MergeSort {
	
	// this class should not be instantiated
	private MergeSort(){	}
	
	static int[] merge(int[] sub_l, int[] sub_r){
		int[] arr_merge = new int[sub_l.length + sub_r.length];
		
		int i, j, k;
		i = j = k = 0;
		
		while(i<sub_l.length && j<sub_r.length)
			if(sub_l[i]<sub_r[j])
				arr_merge[k++] = sub_l[i++];
			else
				arr_merge[k++] = sub_r[j++];
		
		while(i<sub_l.length)
			arr_merge[k++] = sub_l[i++];
		while(j<sub_r.length)
			arr_merge[k++] = sub_r[j++];
		
		return arr_merge;
	}
	
	static int[] sort(int[] array){
		if (array.length == 1)
			return array;
		
		int half = array.length/2;
		int[] sub_l = new int[half];
		int[] sub_r = new int[array.length - half];
		
		System.arraycopy(array, 0, sub_l, 0, sub_l.length);
		System.arraycopy(array, half, sub_r, 0, sub_r.length);
		
//		System.out.println(Arrays.toString(sub_l));
//		System.out.println(Arrays.toString(sub_r));

		
		sub_l = sort(sub_l);
		sub_r = sort(sub_r);
		
		return merge(sub_l, sub_r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {3,5,8,4,6,1,2,7,9,0};
		
		int[] array_sorted = sort(array);
		
//		for (int i=0; i<array_sorted.length; i++)
//			System.out.print(array_sorted[i] + ", ");
		
		System.out.println(Arrays.toString(array_sorted));
	}

}
