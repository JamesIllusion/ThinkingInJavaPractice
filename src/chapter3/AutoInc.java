//: AutoInc.java
// Demonstrates the ++ and -- operators

package chapter3;

public class AutoInc {
	public static void main(String[] args){
		int i=1;
		
		prt("i : " + i);
		prt("++i : " + ++i); // Pre-increment
		prt("i++ : " + i++); // Post-increment 
		prt("i : " + i);
		prt("--i : " + --i); // Pre-decrement
		prt("i-- : " + i--); // Post-decrement
		prt("i : " + i);   
	}
	
	static void prt(String str){
		System.out.println(str);
	}

}
