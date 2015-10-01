//: Wind.java
// Inheritance & upcasting

package chapter6;
import java.util.*;

class Instrument{
	public void play(){
		// TODO
		System.out.println("Instrument.play");
	}
	
	static void tune(Instrument i){
		i.play();
		System.out.println("This is Instrument.tune");
	}
	
}

public class Wind extends Instrument {
	public static void main(String[] args){
		Wind flute = new Wind();
		Instrument.tune(flute);		// upcasting
	}

}
