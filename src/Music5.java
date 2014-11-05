import java.util.*;

interface Instrument5{
	int i=5;
	
	void play();
	String what();
	void adjust();
}

class Wind5 implements Instrument5{
	public void play(){
		System.out.println("Wind.play");
	}
	
	public String what(){
		return "Wind";
	}
	
	public void adjust(){
		
	}
}

class Percussion5 implements Instrument5{
	public void play(){
		System.out.println("Percussion.play");
	}
	
	public String what(){
		return "Percussion";
	}
	
	public void adjust(){
		
	}
}

class Stringed5 implements Instrument5{
	public void play(){
		System.out.println("String.play");
	}
	
	public String what(){
		return "Stringed";
	}
	
	public void adjust(){
		
	}
}

class Brass5 extends Wind5{
	public void play(){
		System.out.println("Brass.play");
	}
	
	public void adjust(){
		System.out.println("Brass.adjust");
	}
}

class Woodwind5 extends Wind5{
	public void play(){
		System.out.println("Woodwind.play");
	}
	
	public String what(){
		return "Woodwind";
	}
}

public class Music5 {
	
	static void tune(Instrument5 i){
		i.play();
	}
	static void tuneAll(Instrument5[] e){
		for (int i=0; i<e.length; i++)
			tune((Instrument5) e[i]);
	}
	
	public Music5() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instrument5[] orchestra = new Instrument5[5];
		
		int i=0;
		
		orchestra[i++] = new Wind5();
		orchestra[i++] = new Percussion5();
		orchestra[i++] = new Stringed5();
		orchestra[i++] = new Brass5();
		orchestra[i++] = new Woodwind5();
		
		tuneAll(orchestra);

	}

}
