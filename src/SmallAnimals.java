import java.util.*;

class Rodent{
	public void useTeeth(){
		
	}
	
	public void digHole(){
		
	}
}

class Mice extends Rodent{
	public void useTeeth(){
		System.out.println("Mice.teeth");
	}
	
	public void digHole(){
		System.out.println("Mice.dig");
	}
	
	public void goHome(){
		System.out.println("Mice.home");
	}
}

public class SmallAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
