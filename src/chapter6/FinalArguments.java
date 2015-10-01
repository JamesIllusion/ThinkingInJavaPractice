//: FinalArguments.java
// Using 'final' with method arguments

package chapter6;

class Gizmo{
	public void spin(){
		
	}
}

public class FinalArguments {
	void withFinal(final Gizmo g){
		g.spin();
	}
	
	void withoutFinal(Gizmo g){
		g = new Gizmo();
		g.spin();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalArguments fa = new FinalArguments();
		
		fa.withFinal(null);
		fa.withoutFinal(null);
	}

}
