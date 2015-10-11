//: StringSortTest.java
// Testing the generic soring Vector

package chapter8;

import java.util.*;

public class StringSortTest {
	static class StringCompare implements Compare{

		@Override
		public boolean lessThan(Object lhs, Object rhs) {
			return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase()) < 0;
		}

		@Override
		public boolean lessThanOrEqual(Object lhs, Object rhs) {
			return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase()) <= 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortVector sv = new SortVector(new StringCompare());
		
		 sv.addElement("d");
		 sv.addElement("A");
		 sv.addElement("C");
		 sv.addElement("c");
		 sv.addElement("b");
		 sv.addElement("B");
		 sv.addElement("D");
		 sv.addElement("a");
		 
		 Enumeration e = sv.elements();
//		 while(e.hasMoreElements())
//			 System.out.println(e.nextElement());
		 
		 sv.sort();
		 		 
		 while(e.hasMoreElements())
			 System.out.println(e.nextElement());

	}

}
