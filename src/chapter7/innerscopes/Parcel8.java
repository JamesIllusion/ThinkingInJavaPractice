//: Parcel8.java
// An anonymous inner class that performs
// initialization. A briefer version
// of Parcel5.java

package chapter7.innerscopes;

public class Parcel8 {
	public Destination dest(final String dest){
		return new Destination(){
			private String label = dest;
			public String label(){
				System.out.println("Parcel8.label = " + label);
				return label;
			}
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel8 p = new Parcel8();
		Destination d = p.dest("Los Angeles_LAX");
//		d.readLabel();
//		d.label();
	}
}
