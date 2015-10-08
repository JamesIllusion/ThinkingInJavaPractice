//: Music4.java
// Abstract classes and methods

package chapter7;
import java.util.*;

abstract class Instrument4{
	public abstract void play();
	public String what(){
		return "Instrument4";
	}
	public abstract void adjust();
}

class Wind4 extends Instrument4{
	public void play(){
		System.out.println("Wind.play");
	}
	
	public String what(){
		return "Wind4";
	}
	
	public void adjust(){	
	}
}

class Percussion4 extends Instrument4{
	public void play(){
		System.out.println("Percussion.play");
	}
	
	public String what(){
		return "Percussion";
	}
	
	public void adjust(){
		
	}
}

class Stringed4 extends Instrument4{
	public void play(){
		System.out.println("String.play");
	}
	
	public String what(){
		return "Stringed4";
	}
	
	public void adjust(){
		
	}
}

class Brass4 extends Wind4{
	public void play(){
		System.out.println("Brass.play");
	}
	
	public void adjust(){
		System.out.println("Brass.adjust");
	}
}

class Woodwind4 extends Wind4{
	public void play(){
		System.out.println("Woodwind.play");
	}
	
	public String what(){
		return "Woodwind";
	}
}

public class Music4 {
	static void tune(Instrument4 i){
		i.play();
	}
	static void tuneAll(Instrument4[] e){
		for (int i=0; i<e.length; i++)
			tune(e[i]);
	}
	
	public static void main(String args[]){
		Instrument4[] orchestra = new Instrument4[5];
		
		int i=0;
		
		orchestra[i++] = new Wind4();
		orchestra[i++] = new Percussion4();
		orchestra[i++] = new Stringed4();
		orchestra[i++] = new Brass4();
		orchestra[i++] = new Woodwind4();
		
		tuneAll(orchestra);
		
		orchestra[3].play();
		
		System.out.println(orchestra[4].what());
	}

}
