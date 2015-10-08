//: Adventure.java
// Multiple interfaces

package chapter7;
import java.util.*;

interface canFight{
	void fight();
}

interface canSwim{
	void swim();
}

interface canFly{
	void fly();
}

class ActionCharacter{
	public void fight(){
		
	}
}

class Hero extends ActionCharacter implements canFight, canSwim, canFly{
	public void swim(){
		
	}
	
	public void fly(){
		
	}
}

public class Adventure {
	static void a(canFight x){
		x.fight();
	}
	
	static void b(canSwim y){
		y.swim();
	}
	
	static void c(canFly z){
		z.fly();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero superman = new Hero();
		
	}

}
