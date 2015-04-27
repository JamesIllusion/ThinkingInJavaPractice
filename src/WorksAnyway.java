import java.util.*;

class Mouse{
	private int mouseNumber;
	
	Mouse(int i){
		mouseNumber = i;
	}
	
	public String toString(){
		return "This is Mouse#" + mouseNumber;
	}
	
	void print (String msg){
		if(msg != null)
			System.out.println(msg);
		
		System.out.println("Mouse number" + mouseNumber);
	}
}

class MouseTrap{
	static void caught(Object m){
		Mouse mouse = (Mouse) m;
		mouse.print("Caught one");
	}
}

public class WorksAnyway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector mice = new Vector();
		for(int i=0; i<5; i++)
			mice.addElement(new Mouse(i));
		
		for (int i=0; i<mice.size(); i++){
			System.out.println("Free mouse: " + mice.elementAt(i));
			MouseTrap.caught(mice.elementAt(i));
		}

	}

}
