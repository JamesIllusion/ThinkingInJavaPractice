//: InitialValues.java
// Shows default initial values

package chapter4;

class Measurement{
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	void print(){
		System.out.println(
				"Data type " + "\t" + "Initial value\n" +
				"boolean " + "\t" + t + "\n" +
				"char " + "\t" + c + "\n" + 
				"byte " + "\t" + b + "\n" + 
				"short "+ "\t" + s + "\n" + 
				"int "  + "\t" + i + "\n" + 
				"long " + "\t" + l + "\n" +
				"float "+ "\t" + f + "\n" + 
				"double " + "\t" + d);
	}
}

public class InitialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Measurement d = new Measurement();
		
		d.print();
	}
}
