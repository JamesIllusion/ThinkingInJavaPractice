//: StaticInitialization.java
// Specifying initial values in a 
// class definition

package chapter4;

class Bowl{
	Bowl(int marker){
		System.out.println("Bowl(" + marker + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Table{
	static Bowl b1 = new Bowl(1);								// 1st init in Table

	Table(){
		System.out.println("Table()");
		b2.f(1);
	}

	void f2(int marker){
		System.out.println("f2(" + marker +")");
	}
	
	static Bowl b2 = new Bowl(2);								// 2nd init Table
}

class Cupboard{
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);								// 1st init in Cupboard

	Cupboard(){
		System.out.println("CupBoard()");
		b4.f(2);
	}

	void f3 (int marker){
		System.out.println("f3(" + marker + ")");
	}
	
	static Bowl b5 = new Bowl(5);								// 2nd init in Cupboard
}

public class StaticInitialization{
	
	public static void main(String[] args){
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
	}

	static Table t2 = new Table();								// 1st init in all
	static Cupboard t3 = new Cupboard();						// 2nd init in all

}
