//: Parcel3.java
// Returning a handle to an inner class

package chapter7.parcel;

abstract class Contents{
	abstract public int value();
}

interface Destination{
	String readLabel();
}

public class Parcel3 {
	private class p3Contents extends Contents{
		private int i = 773;
		public int value(){
			System.out.println("value = " + i);
			return i;
		}
	}
	
	protected class p3Destination implements Destination{
		private String label;
		private p3Destination(String whereTo){
			label = whereTo;
			System.out.println("whereTo is " + label);
		}
		public String readLabel(){
			System.out.println("readLabel is " + label);
			return label;
		}
	}
	
	public Destination dest(String s){
		System.out.println(s);
		return new p3Destination(s);
	}
	
	public Contents cont(){
		return new p3Contents();
	}

}

class Test{
	public static void main(String[] args){
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("Washington_DCA");
		c.value();
		d.readLabel();
	}
}
