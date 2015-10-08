//: WindError.java
// Accidentally changing the interface

package chapter7;

class NoteX{
	public static final int
		MIDDLE_C = 0, C_SHARP=1, C_FLAT=2;
}

class InstrumentX{
	public void play(int NoteX){
		System.out.println("InstrumentX.play ");
	}
}

class WindX extends InstrumentX{
	public void play(NoteX n){						// THIS IS NOT A OVERWRITE OF SUPERCLASS METHOD!!!
		System.out.println("WindX.play(NoteX n)");
	}
/*	
	public void play(int n){
		
	}
*/
}

public class WindError {
	public static void tune(InstrumentX i){
		i.play(NoteX.MIDDLE_C);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindX flute = new WindX();
		tune(flute);
	}

}
