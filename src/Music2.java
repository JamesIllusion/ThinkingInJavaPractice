class Note2{
	private int value;
	private Note2(int val){
		value = val;
	}
	
	public static final Note2 middleC = new Note2(0);
	public static final Note2 cSharp = new Note2(1);
	public static final Note2 cFlat = new Note2(2);
}

class Instrument2{
	public void play(Note2 n){
		System.out.println("Instrument2.play()");
	}
}

class Wind2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("Wind2.play()");
	}
}

class String2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("String2.play()");
	}
}

class Brass2 extends Instrument2{
	public void play(Note2 n){
		System.out.println("Brass2.play()");
	}
}

public class Music2 {

	/**
	 * @param args
	 */
	
	public static void tune(Wind2 wi){
		wi.play(Note2.middleC);
	}
	
	public static void tune(String2 st){
		st.play(Note2.cSharp);
	}
	
	public static void tune(Brass2 br){
		br.play(Note2.cFlat);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wind2 flute = new Wind2();
		String2 violin = new String2();
		Brass2 frenchhorn = new Brass2();
		
		tune(flute);
		tune(violin);
		tune(frenchhorn);

	}

}
