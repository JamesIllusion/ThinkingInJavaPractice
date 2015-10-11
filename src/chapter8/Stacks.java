//: Stacks.java
// Demonstration of Stack Class

package chapter8;

import java.util.*;

public class Stacks {
	final static String[] MONTHS = {
			"January", "February", "March", "April",
			"May", "June", "July", "August",
			"September", "October", "November", "December"
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stk = new Stack();
		
		for(int i=0; i<MONTHS.length; i++)
			stk.push(MONTHS[i] + " ");
		System.out.println("stk = " + stk + "\n");
		
		stk.addElement("The last line");
		System.out.println(
				"element 5 = " + stk.elementAt(5) + "\n");
		
		System.out.println("Popping elements: ");
		while(!stk.empty())
			System.out.println(stk.pop());
	}

}
