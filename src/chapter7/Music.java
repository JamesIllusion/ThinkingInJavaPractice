//: Music.java
// Inheritance and upcasting

package chapter7;

class Note{
	private int value;
	private Note(int val){
		value = val;
	}
	public static final Note
		middleC = new Note(0),
		cCharp = new Note(1),
		cFlat = new Note(2);
}

class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play " + n);
	}
}

class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind.play " + n);
	}
}

public class Music {
	public static void tune(Instrument i){
		System.out.println("Instrument.tune");
		i.play(Note.middleC);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wind flute = new Wind();
		tune(flute);
	}

}
