class Note2{
	@SuppressWarnings("unused")
	private int value;
	
	private Note2(int val){
		value = val;
	}
	
	
	public static final Note2 middleC = new Note2(0);
	public static final Note2 cSharp = new Note2(1);
	public static final Note2 cFlat = new Note2(1);
}

class Instrument2{
	public void play(Note2 n){
		System.out.println("Instrument.play()");
	}
}

class Wind2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("Wind.play()");
	}
}

class Stringed2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("String.play()");
	}
}

class Brass2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("Brass.play()");
	}
}

public class Music2 {

	public Music2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void tune(Wind2 i){
		i.play(Note2.cFlat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
