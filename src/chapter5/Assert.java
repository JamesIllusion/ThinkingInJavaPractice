//: Assert.java
// Assertion tool for debugging

package chapter5;

public class Assert{
	private static void perr(String msg){
		System.err.println(msg);
	}

	public final static void isTrue(boolean exp){
		if(!exp)
			perr("Assertion failed");
	}
	
	public final static void isFalse(boolean exp){
		if(exp)
			perr("Assertion failed");
	}
	
	public final static void isTrue(boolean exp, String msg){
		if(!exp)
			perr("Assersion failed " + msg);
	}
	
	public final static void isFales(boolean exp, String msg){
		if(exp)
			perr("Assertion failed " + msg);
	}
}
