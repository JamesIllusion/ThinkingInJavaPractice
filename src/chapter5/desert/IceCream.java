//: IceCream.java
// Demonstrates "private" keyword

package chapter5.desert;

class Sundae{
	private Sundae(){}
	static Sundae makeASundae(){
		return new Sundae();
	}
}

public class IceCream{
	
	public static void main(String[] args){
//		Sundae x = new Sundae();
		Sundae y = Sundae.makeASundae();
		
	}
}
