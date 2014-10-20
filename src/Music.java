class Note{
	private int value;
	
	private Note(int val){
		value = val;
	}
	
	public static final Note middleC = new Note(0);
	public static final Note cSharp = new Note(1);
	public static final Note cFlat = new Note(2);
}

class Instrument{
	public void play(Note n){
		System.out.println("Instrument.play()");
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
		System.out.println("Instrument " + i + " to play middleC.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wind flute = new Wind();
		tune(flute);
	}

}
