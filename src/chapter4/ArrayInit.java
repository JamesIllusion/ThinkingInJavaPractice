//: ArrayInit.java
// Array Initialization

package chapter4;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a= {
				new Integer(1),
				new Integer(2),
				new Integer(3),
		};
	
		for(int i=0; i<a.length; i++){
			System.out.println("Integer = " + a[i]);
		}
	}
}
