//: Cartoon.java
// Constructor calls during inheritance

package chapter6;

class Art{
	Art(){
		System.out.println("Default Art Constructor");
	}
}

class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing Constructor");
	}
}

public class Cartoon extends Drawing{
	Cartoon(){
		System.out.println("Cartoon Constructor");
	}

	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}
