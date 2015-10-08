//: Parcel6.java
// A method that returns an anonymous inner class

package chapter7.innerscopes;

public class Parcel6 {
	public Contents cont(){
		return new Contents(){
			private int i = 60616;
			public int value(){
				System.out.println("value in Parcel6 is " + i);
				return i;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel6 p = new Parcel6();
		Contents c = p.cont();
		c.value();
	}
}
