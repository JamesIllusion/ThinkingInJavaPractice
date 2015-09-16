//: OverloadingOrder.java
// Overloading based on the order of 
// the arguments

package chapter4;

public class OverloadingOrder {
	static void print(String s, int i){
		System.out.println(
				"String: " + s + 
				", int: " + i);
	}
	
	static void print(int i, String s){
		System.out.println(
				"int: " + i + 
				", String: " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("String first", 11);
		print(99, "int first");
	}
}
