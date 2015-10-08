//: InheritInner.java
// Inheriting an inner class

package chapter7;

class WithInner{
	class Inner{
		Inner(){
			System.out.println("WithInner.Inner.construct");
		}
	}
	
	WithInner(){
		System.out.println("WithInner.construct");
	}
}

public class InheritInner extends WithInner.Inner{
//	InheritInner() {}
	InheritInner(WithInner wi){
//	InheritInner(){
		wi.super();
//		wi.Inner.Inner();
		
		System.out.println("InheritInner.construct");
	}

	public static void main(String[] args){
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
//		InheritInner ii = new InheritInner();
	}
}
