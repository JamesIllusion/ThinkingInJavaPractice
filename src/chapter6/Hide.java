//: Hide.java
// Overloading a base-class method name
// in a derived class does not hide the 
// base-class versions

package chapter6;

class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{}

class Bart extends Homer{
	void doh(Milhouse m){}
}

public class Hide {
	public static void main(String[] args){
		Bart b = new Bart();
		b.doh(1);		// float constructor
		b.doh('x');		// char constructor
		b.doh(1.0f);	// float constructor
		b.doh(new Milhouse());
	}
}
