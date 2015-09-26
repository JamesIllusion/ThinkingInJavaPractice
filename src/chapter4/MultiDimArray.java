//: MultiDimArray.java
// Creating multidimensional arrays

package chapter4;

import java.util.*;

public class MultiDimArray{
	static Random rand = new Random();
	static int pRand(int mod){
		return Math.abs(rand.nextInt())%mod +1;
	}

	static void prt(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		int[][]a1 = {
			{1,2,3},
			{4,5,6},
		};
		
		for (int i=0; i<a1.length; i++)
			for (int j = 0; j<a1[i].length; j++)
				prt("a[%d][%d] = " + a1[i][j]);
	}
}
