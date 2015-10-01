//: Orc.java
// The protected keyword

package chapter6;
import java.util.*;

class Villain{
	private int i;
	protected int read(){
		return i;
	}
	
	protected void set(int ii){
		i = ii;
	}
	
	public Villain(int ii){
		i = ii;
	}
	
	public int value(int m){
		return m*i;
	}
}

public class Orc extends Villain{
	
	private int j;

	public Orc(int jj) {
		super(jj);
		// TODO Auto-generated constructor stub
		j = jj;
	}
	
	public void change(int x){
		set(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	}

}
