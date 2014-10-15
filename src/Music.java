class Note{
	private int value;
	
	private Note(int val){
		value = val;
	}
	
	public static final Note middleC = new Note(0);
	public static final Note cSharp = new Note(1);
	public static final Note cFlat = new Note(1);
}

class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play " + n);
	}
}

class Wind extends Instrument{
	public void play(Note n){
		System.out.println("Wind.play()");
	}
}

public class Music {
	public static void tune(Instrument i){
		i.play(Note.middleC);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wind flute = new Wind();
		
		tune(flute);
	}

}
