//: RTTI.java
// Downcasting & Run-time Type
// Identification (RTTI)

package chapter7;
import java.util.*;

class Useful{
	public void f(){
		
	}
	
	public void g(){
		
	}
}

class MoreUseful extends Useful{
	public void f(){
		
	}
	
	public void g(){
		
	}
	
	public void u(){
		
	}
	
	public void v(){
		
	}
	
	public void w(){
		
	}
}

public class RTTI {
	
	public static void main(String[] args){
		Useful[] x= {
				new Useful(),
				new MoreUseful()				
		};
	}

}
