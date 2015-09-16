//: Mugs.java
// Java 1.1 "Instance Initialization"

package chapter4;

class Mug{
	Mug(int marker){
		System.out.println("Mug(" + marker + ")");
	}
	
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

public class Mugs {
	Mug m1;
	Mug m2;
	{
		m1 = new Mug(1);
		m2 = new Mug(2);
		System.out.println("m1 & m2 initialized");
	}
	
	Mugs(){
		System.out.println("Mugs()");
	}
	
	public static void main(String[] args){
		System.out.println("Inside main");
		Mugs x = new Mugs();
	}

}
