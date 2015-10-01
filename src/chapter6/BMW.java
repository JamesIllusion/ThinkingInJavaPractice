//: BMW.java (Car.java)
// Composition with public objects

package chapter6;

import java.io.*;

class Engine{
	public Engine(){
		//constructor
	}

	public void start(){
		System.out.println("Engine starts");
	}
	public void stop(){
		System.out.println("Engine stops");
	}
	public void rev(){
		System.out.println("Engine reverses");
	}
}

class Window{
	public Window(){
		//constructor
	}

	public void rollUp(){
		System.out.println("Window rolls up");
	}
	public void rollDown(){
		System.out.println("Window rolls down");
	}
}

class Wheel{
	public Wheel(){
		//constructor
	}

	public void inflate(int psi){
		System.out.println("Tire pressure is " + psi+ " psi");
	}
}

class Door{
	public Door(){
			//constructor
	}
	
	Window doorW = new Window();

	public void open(){
		System.out.println("Door opens");
	}
	public void close(){
		System.out.println("Door closes");
	}
}

class Car{
	Engine eng = new Engine();
	Wheel[] wheel = new Wheel[4];
	
	Car(int n){
		System.out.println("This is a " + n + " door car.");
		for(int i=0; i<4; i++)
			wheel[i] = new Wheel();
	}
}

public class BMW extends Car{
	public BMW(int dN){
		super(dN);
//		super.doorNum = dN;
		int doorNum = dN;
		
		System.out.println("This is a " + dN + " door BMW");
	}

	public static void main(String[] args){
		BMW M6 = new BMW(2);
		
		M6.eng.start();
		M6.wheel[0].inflate(32);
	}
}		
