//: BlankFinal.java
// "Blank" final data members

package chapter6;

class Poppet{
	
}

public class BlankFinal {
	final int i = 0;				// Initialized final
	final int j;					// Blank final
	final Poppet p;					// Blank final handle

	BlankFinal(){
		j = 1;						// Initialize blank final
		p = new Poppet();
	}
	
	BlankFinal(int x){
		j = x;						// Initialize blank final
		p = new Poppet();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlankFinal bf = new BlankFinal();
	}

}
