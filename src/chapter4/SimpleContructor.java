//: SimpleContrusctor.java
// Demonstration of a simple constructor

package chapter4;

class Rock{
	Rock(){		//This is the constructor
		System.out.println("Creating Rock!");
	}
}

public class SimpleContructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
			new Rock();
	}
}
