//: AssocArray.java
// Simple version of a Dictionary

package chapter8;

import java.util.*;

public class AssocArray extends Dictionary{
	private Vector keys = new Vector();
	private Vector values = new Vector();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssocArray aa = new AssocArray();
		
		for(char c = 'a'; c<='z'; c++)
			aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		
		char[] ca = {'a', 'e', 'i', 'o', 'u'};
		for(int i=0; i<ca.length; i++)
			System.out.println("Uppercase: " + aa.get(String.valueOf(ca[i])));

	}

	@Override
	public Enumeration elements() {
		return values.elements();
	}

	@Override
	public Object get(Object key) {
		int index = keys.indexOf(key);
		
		if(index == -1)
			return null;
		return values.elementAt(index);
	}

	@Override
	public boolean isEmpty() {
		return keys.isEmpty();
	}

	@Override
	public Enumeration keys() {
		return keys.elements();
	}

	@Override
	public Object put(Object key, Object value) {
		keys.addElement(key);
		values.addElement(value);
		return key;
	}

	@Override
	public Object remove(Object key) {
		int index = keys.indexOf(key);
		
		if(index == -1)
			return null;
		
		keys.removeElementAt(index);
		Object returnval = values.elementAt(index);
		values.removeElementAt(index);
		
		return returnval;
	}

	@Override
	public int size() {
		return keys.size();
	}

}
