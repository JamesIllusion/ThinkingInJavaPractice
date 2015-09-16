//: OrderOfInitialization.java
// Demonstrates initialization order.

package chapter4;

// When the constructor is called, to create a 
// Tag object, you'll see a message
class Tag{
	Tag(int marker){
		System.out.println("Tag(" + marker + ")");
	}
}

class Card{
	Tag t1 = new Tag(1);
	
	Card(){
	System.out.println("Card()");
	t3 = new Tag(33);
	}

	Tag t2 = new Tag(2);

	void f(){
		System.out.println("f()");
	}

	Tag t3 = new Tag(3);
}

public class OrderOfInitialization{
	public static void main(String[] args){
		Card t = new Card();
		t.f();
	}
}
