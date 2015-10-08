//: Rodentia.java
// Exercise 7-1, 7-2
// create Rodent: Mouse, Gerbil, Hamster inheritance level.
// Create Rodent as an Interface

package chapter7;

interface Rodent{
	void gnaw();
	void smell();
}

class Mouse implements Rodent{

	@Override
	public void gnaw() {
		// TODO Auto-generated method stub
		System.out.println("Mouse.gnaw");
	}

	@Override
	public void smell() {
		// TODO Auto-generated method stub
		System.out.println("Mouse.smell");
	}
}

class Gerbil implements Rodent{

	@Override
	public void gnaw() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil.gnaw");
	}

	@Override
	public void smell() {
		// TODO Auto-generated method stub
		System.out.println("Gerbil.smell");
	}
	
}

class Hamster implements Rodent{

	@Override
	public void gnaw() {
		// TODO Auto-generated method stub
		System.out.println("Hamster.gnaw");
	}

	@Override
	public void smell() {
		// TODO Auto-generated method stub
		System.out.println("Hamster.smell");
	}
	
}

public class Rodentia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rodent[] rodents = new Rodent[5];
	}

}
