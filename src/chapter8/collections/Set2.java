//: Set2.java
// Putting your own type in a Set

package chapter8.collections;

import java.util.*;

class MyType implements Comparable{
	private int i;
	
	public MyType(int n){
		i = n;
	}
	
	public boolean equals(Object o){
		return (o instanceof MyType) && (i == ((MyType)o).i);
	}
	
	public int hashCode(){
		return i;
	}
	
	public String toString(){
		return i +" ";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int i2 = ((MyType)o).i;
		
		return (i2<i ? -1 : (i2 == i? 0 : 1));
	}
}

public class Set2 {
	public static Set fill(Set a, int size){
		for(int i=0; i<size; i++)
			a.add(new MyType(i));
		
		return a;
	}
	
	public static Set fill(Set a){
		return fill(a, 10);
	}
	
	public static void test(Set a){
		fill(a);
		fill(a);
		fill(a);
		
		a.addAll(fill(new TreeSet()));
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test(new HashSet());
		test(new TreeSet());

	}

}
