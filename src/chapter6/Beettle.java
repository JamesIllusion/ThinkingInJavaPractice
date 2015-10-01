//: Beettle.java
// The full process of initialization

package chapter6;

class Insect{
	int i = 9;
	int j;
	
	Insect(){
		prt("i= " + i + ", j= " + j);
		j=39;
	}
	
	static int x1 = prt("static Insect.x1 initialized");
	
	static int prt(String s){
		System.out.println(s);
		return 47;
	}
}

public class Beettle extends Insect{
	int k = prt("Beetle.k initialized");
	
	Beettle(){
		prt("k = " + k);
		prt("j = " + j);
	}
	
	static int x2 = prt("Beetle.x2 initialized");
	
	static int prt(String s){
		System.out.println(s);
		return 69;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prt("Beettle constructor");
		Beettle bee = new Beettle();
	}

}
