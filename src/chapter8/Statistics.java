//: Statistics.java
// Simple demonstration of Hashtable

package chapter8;

import java.util.*;

class Counter{
	int i=1;
	
	public String toString(){
		return Integer.toString(i);
	}
}

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht = new Hashtable();
		
		for(int i=0; i<10000; i++){
			Integer r = new Integer((int) (Math.random()*20));
			
			if(ht.containsKey(r))
				((Counter)ht.get(r)).i++;
			else
				ht.put(r, new Counter());
		}
		System.out.println(ht);
	}
}
