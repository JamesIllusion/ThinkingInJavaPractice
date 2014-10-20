import java.io.*;

class Engine{
	public Engine(){
		//constructor
	}

	public void start(){
		System.out.println("Engine starts");
	}
	public void stop(){
		System.out.println("Engind stops");
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
	int doorNum;
//	System.out.println(doorNum);
	
	Engine eng = new Engine();
	Door[] door = new Door[doorNum];
	Wheel[] wheel = new Wheel[4];

	Car(int dN){		//constructor
		for (int i=0; i<dN; i++){
		    door[i] = new Door();
//			System.out.println(dN);
			System.out.println(i);
		}
		
		for (int j=0; j<4; j++){
			wheel[j] = new Wheel();
		}
	}
}

public class BMW extends Car{
	public BMW(int dN){
		super(dN);
//		super.doorNum = dN;
		doorNum = dN;
		
		System.out.println("This is a " + dN + " door BMW");
	}

	public static void main(String[] args){
		BMW M6 = new BMW(2);
		
		M6.eng.start();
		M6.wheel[0].inflate(32);
	}
}		
