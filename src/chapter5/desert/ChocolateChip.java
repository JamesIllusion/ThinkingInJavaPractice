//: ChocolateChip.java
// Can't access friendly member
// in another class

package chapter5.desert;

public class ChocolateChip extends Cookie {
	public ChocolateChip(){
		System.out.println("ChocolateChip default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip chc = new ChocolateChip();
		chc.foo();
	}
}
