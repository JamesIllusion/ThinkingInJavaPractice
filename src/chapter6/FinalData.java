//: FinalData.java
// The effect of final on fields

package chapter6;

class Value{
	int i = 1;
}



public class FinalData {
	final int i1 = 9;
	static final int I2 = 99;
	public static final int I3 = 999;
	final int i4 = (int)(Math.random()*20);
	static final int i5 = (int)(Math.random()*20);
	
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	
	public void print(String id){
		System.out.println(id + ": " + "i4 = " + i4 + ", i5 = " + i5);
	}
	
	public static void main(String[] args){
		FinalData fd1 = new FinalData();
		
//		TODO
//		finish the example from book in the future.
	}

}
