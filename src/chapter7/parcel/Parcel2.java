//: Parcel2.java
// Returning a handle to an inner class

package chapter7.parcel;

public class Parcel2 {
	class Contents{
		private int i = 312;
		public int value(){
			System.out.println("Contents.value = " + i);
			return i;
		}
	}
	
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){
			System.out.println("Destination label is " + label);
			return label;
		}
	}
	
	public Destination to(String s){
		return new Destination(s); 
	}
	
	public Contents cont(){
		return new Contents();
	}
	
	public void shipTo(String dest){
		Contents c = cont();
		Destination d = to(dest);
	}
	
	public static void main(String[] args){
		Parcel2 p = new Parcel2();
		p.shipTo("NYC_JFK");
		
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.cont();
		Parcel2.Destination d = q.to("Tokyo_NRT");
		d.readLabel();
	}
	
}
