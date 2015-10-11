//: AlphaComp.java
// Using comparator to perform an alphabetic sort

package chapter8.collections;

import java.util.Arrays;
import java.util.Comparator;

public class AlphaComp implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = Array1.randStrings(4, 15);
		Array1.print(s);
		
		AlphaComp ac = new AlphaComp();
		Arrays.sort(s, ac);
		Array1.print(s);
		
		int loc = Arrays.binarySearch(s, s[3], ac);
		System.out.println("Location of " + s[3] + " = " + loc);
	}

	public int compare(Object o1, Object o2) {
		String s1 = (((String) o1).toLowerCase());
		String s2 = (((String) o2).toLowerCase());
		
		return s1.compareTo(s2);
	}

}
