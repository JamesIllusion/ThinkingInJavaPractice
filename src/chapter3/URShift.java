//: URShift.java
// Test of unsigned right shift

package chapter3;

public class URShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = -1;
		i >>>= 10;
		System.out.println(i);
		
		long l = -1;
		l >>>= 10;
		System.out.println(l);
		
		short s = -1;
		s >>>=10;
		System.out.println(s);
		
		byte b = -1;
		b >>>= 10;
		System.out.println(b);

	}

}
