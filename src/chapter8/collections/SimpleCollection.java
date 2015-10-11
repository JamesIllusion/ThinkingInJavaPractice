//: SimpleCollection.java
// A simple example using the new Collections

package chapter8.collections;

import java.util.*;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		for(int i=0; i<10; i++)
			c.add(Integer.toBinaryString(i));
		
		Iterator it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
