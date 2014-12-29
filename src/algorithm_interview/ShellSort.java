package algorithm_interview;

import java.util.Arrays;

public class ShellSort {
	
	// this class should not be instantiated
	private ShellSort(){		}
	
	static int[] sort(int[] array){
		int temp = 0;
		int pace = (int) Math.ceil(array.length);
		
		while(true){
			pace /=2;
			
			for(int i=0; i<pace; i++)
				for(int j=i+pace; j<array.length; j++){
					int k = j-pace;
					temp = array[j];
					
//					for(; k>=0 && temp<array[k]; k-=pace)
//						array[k+pace] = array[k];
					
					while(k>=0 && temp<array[k]){
						array[k+pace] = array[k];
						k-=pace;
					}array[k+pace] = temp;
					
				}
			
			if(pace==1)
				break;
		}
		
		return array;
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
