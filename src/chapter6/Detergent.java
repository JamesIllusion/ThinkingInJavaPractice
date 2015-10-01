//: Detergent.java
// Inheritance syntax & properties

package chapter6;

class Cleanser{
	private String str = new String ("Cleanser");
	public void append(String a ) { str += a;}
	public void dilute() { append ("_dilute()"); }
	public void apply() { append ("_apply()"); }
	public void scrub() { append ("_scrub()"); }
	
	public void print(){
		System.out.println(str);
	}

	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();

		x.print();
	}
}

public class Detergent extends Cleanser{
	public void scrub(){
		append(" // Detergent.scrub()");
		super.scrub();
	}

	public void foam(){
		append("_foam()");
	}

	public static void main(String[] args){
		Detergent x = new Detergent();

		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.print();	

		System.out.println("Testing base class:");

		Cleanser.main(args);
	}
}
