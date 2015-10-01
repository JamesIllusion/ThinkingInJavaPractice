//: Jurassic.java
// Making an entire class final

package chapter6;

class SmallBrain{}

final class Dinosaur{
	int i = 5;
	int j = 0;
	
	SmallBrain sb = new SmallBrain();
	
	void f(){
		System.out.println("Final class print");
	}
}

public class Jurassic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinosaur lisa = new Dinosaur();
		
		lisa.f();
		lisa.i = 40;
		lisa.j++;
	}
}
