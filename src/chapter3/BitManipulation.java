//: BitManipulation.java
// Using the bitwise operators

package chapter3;
import java.util.*;

public class BitManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int i = rand.nextInt();
		int j = rand.nextInt();
		
		pBinInt ("-1", -1);
		pBinInt ("+1", +1);
		
		int maxpos = 214783647;
		pBinInt ("maxpos", maxpos);
		int minneg = -214783648;
		pBinInt ("minneg", minneg);
	}
	
	static void pBinInt(String s, int i){
		System.out.println(s + ", int: " + i + ", binary: ");
		System.out.print("   ");
		
		for(int j=31; j>=0; j--)
			if(((1<<j)&i)!=0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}
	
	static void pBinLong(String s, long l){
		System.out.println(s + ", long: " + l + ", binary: ");
		System.out.print("    ");
		
		for(int i=63; i>=0; i--)
			if(((1L<<i)&l)!=0)
				System.out.print("1");
			else
				System.out.print("0");
		System.out.println();
	}

}
