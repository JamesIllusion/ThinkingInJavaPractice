//: Lunch.java
// Demonstrates class access specifiesrs
// Make a class effectively private
// with private constructors

package chapter5;

class Soup{
	private Soup(){
		// Allow creation via static method
	}
	public static Soup makeSoup(){
		return new Soup();
	}
		
	// Create a static  object and 
	// return a reference upon request
	private static Soup ps1 = new Soup();
	public static Soup access(){
		return ps1;
	}
	public void f(){}
}

class Sandwich{
	void f(){
		new Lunch();
	}
}

public class Lunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	void test(){
//		Soup priv1 = new Soup();
		Soup priv2 = Soup.makeSoup();
		Sandwich f1 = new Sandwich();
		Soup.access().f();
	}
}
